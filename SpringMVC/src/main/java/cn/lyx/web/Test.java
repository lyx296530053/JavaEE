package cn.lyx.web;

import cn.lyx.daomin.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class Test {
    @RequestMapping("/show/{id}")
    public String show() {
        System.out.println("66666");
        return "success";
    }
    @RequestMapping("/show1")
    public String show1(@RequestBody User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/show2")
    public String show2(@RequestParam(value = "name", required = true) String names) {
        System.out.println(names);
        return "success";
    }

    @RequestMapping("/show3")
    public String show3(@RequestBody(required = false) String body) {
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/show4/{id}")
    public String show4(@PathVariable("id") Integer uid) {
        System.out.println(uid);
        return "success";
    }

   // @ModelAttribute
    public void show5(Integer age, String address, Date date, Map<String,User> Map) {
        User user=new User();
        user.setName("李四");
        user.setAddress(address);
        user.setAge(age);
        user.setDate(date);
        Map.put("abc",user);
    }

    @RequestMapping("/show6")
    public String show6(@ModelAttribute("abc") User user){

        System.out.println(user);
        return "success";
    }
    @RequestMapping("/show7")
    public String show7(Model  model){
       model.addAttribute("msg","meimei");
        return "success";
    }
    @RequestMapping("/show8")
    public void show8(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("show8","hello");
        request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request,response);
    }
    @RequestMapping("show9")
    public String show9(HttpServletRequest request) throws Exception {
        String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(realPath);
        if(!file.exists()){
            file.mkdirs();
        }
        DiskFileItemFactory diskFileItemFactory=new DiskFileItemFactory();
        ServletFileUpload fileUpload=new ServletFileUpload(diskFileItemFactory);
        List<FileItem> fileItems = fileUpload.parseRequest(request);
        for (FileItem fileItem : fileItems) {
            if(fileItem.isFormField()){
            }else {
                String fieldName = fileItem.getFieldName();
                fileItem.write(new File(realPath,fieldName));
                fileItem.delete();
            }
        }
        return "success";
    }
    @RequestMapping("/show10")
    public String show7(HttpServletRequest request, MultipartFile upload) throws IOException {
        String name = upload.getName();
        String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        upload.transferTo(new File(realPath,name));
        return "success";
    }
}
