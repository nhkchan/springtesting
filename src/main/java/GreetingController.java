package main.java;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.json.JsonWriter;

@SuppressWarnings("unused")
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Basic rootReturn() {
    		Basic basic = new Basic(1, "Yello");
		return basic;
    }
    
    @RequestMapping(value = "/basic", method = RequestMethod.GET)
    @ResponseBody
    public String basics(@RequestParam(value="name", defaultValue="World") String name) {
    		
    		Basic basic = new Basic(1,"First");
    		JsonObjectBuilder jbuild = Json.createObjectBuilder();
    		jbuild.add("Hello", "World");
    		String jObject = jbuild.build().toString();
    		
    		return jObject;
    }
    
    @RequestMapping(value = "/basic", method = RequestMethod.POST)
    @ResponseBody
    public JsonObject basicPost(@RequestParam(value="name", defaultValue="World") String name) {
    		
    		Basic basic = new Basic(1,"First");
    		JsonObjectBuilder jbuild = Json.createObjectBuilder();
    		JsonObject jObject = jbuild.build();
    		
    		return jObject;
    }
    
    @RequestMapping(
    	    value = "/process", 
    	    method = RequestMethod.POST,
    	    consumes = "application/json")
    	public String process(@RequestBody String payload) throws Exception {

    	  System.out.println(payload);
    	  return payload;

    	}
    
    /*
     * JSON String example
     * 
     */
    /*
    @RequestMapping(value = "/basic", method = RequestMethod.GET)
    @ResponseBody
    public Object basicReturn() throws JSONException {
    		Basic basic = new Basic(1, "Yello");
    		String yes = basic.basic(basic);
    		Object no = yes;
		return no;
    }
    */
    
    @RequestMapping(value="/greeting", method = RequestMethod.GET)
    @ResponseBody
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
}