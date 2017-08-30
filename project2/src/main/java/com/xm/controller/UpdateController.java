package com.xm.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/update")
public class UpdateController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "update";
	}
	
	@ResponseBody
	@RequestMapping("/update2") 
	public String singleSave(HttpServletRequest request,@RequestParam("file") MultipartFile file, @RequestParam("desc") String desc ){
	    	System.out.println("File Description:"+desc);
	    	String fileName = null;
	    	if (!file.isEmpty()) {
	            try {
	                fileName = file.getOriginalFilename();
	                byte[] bytes = file.getBytes();
	                String path = request.getSession().getServletContext().getRealPath("upload");
	                path += File.separator;
	                BufferedOutputStream buffStream = 
	                        new BufferedOutputStream(new FileOutputStream(new File(path + fileName)));
	                buffStream.write(bytes);
	                buffStream.close();
	                
	                //相对路径   ../../webapp/update/+ 年月日时分秒+6位随机数
	                return "成功上传" + fileName;
	            } catch (Exception e) {
	                return "上传失败" + fileName + ": " + e.getMessage();
	            }
	        } else {
	            return "没有选择文件";
	        }
	    }
}
