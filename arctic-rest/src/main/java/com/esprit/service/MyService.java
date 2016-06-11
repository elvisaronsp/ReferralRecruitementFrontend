package com.esprit.service;


import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.esprit.domain.Book;
import com.esprit.http.client.MyHTTPClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;


@Path("/myService")
public class MyService {
	
	@EJB
	BookService bookService;
	
	@EJB
	MyHTTPClient httpClient;
	
	@GET
	@Path("/sayHello")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello(){
		
		
		String data="{title: \"foo\",body: \"bar\",userId: 1}";
		
		
		return httpClient.post("http://jsonplaceholder.typicode.com/posts",data);
	}
	
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/addBook/")
	public String addBook(String bookJson){
		
		Gson gson=new GsonBuilder()
		.serializeNulls()
		.registerTypeAdapter(Book.class,new JsonSerializer<Book>() {

			@Override
			public JsonElement serialize(Book src, Type typeOfSrc,
					JsonSerializationContext context) {
				
				JsonObject result=new JsonObject();
				
				result.addProperty("ISBN", "IS-"+src.getIsbn());
				result.addProperty("head", "<"+src.getTitle()+">");
				return result;
			}
		} )
		.create();
		
		Book book=gson.fromJson(bookJson, Book.class);
		
		System.out.println(gson.toJson(book));
		
	bookService.add(book);
//		
		System.out.println(bookService.getBooks());
		
		
		//Map<String, Object> message=new HashMap<String, Object>();
		
		JsonObject message=new JsonObject();
		
		
		message.addProperty("LEVEL", "INFO");
		message.addProperty("CENTENT", "null");
		
		return gson.toJson(message);
	}

}
