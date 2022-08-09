package springmvcfileupload.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@GetMapping("fileForm")
	public String openFileForm()
	{
		return "file_upload_input"; 
	}
	
	@PostMapping("/uploadFile")
	public String fileUpload(@RequestParam("fileUploadProflie") CommonsMultipartFile file,HttpSession session)
	{
		System.out.println("file is being upladed.."+file.getOriginalFilename());
		
		byte[] data=file.getBytes();
		
		
		FileOutputStream fos=null;
		
		String path="c:"+File.separator+"vikas"+File.separator+"fileUpload"+File.separator+file.getOriginalFilename();
		System.out.println("file is being path2=.."+path);
	
	try {
		 fos=new FileOutputStream(path);
		fos.write(data);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		return "success";
	}

}
