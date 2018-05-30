package basicservlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet(description = "For File Upload", urlPatterns = { "/Upload" })
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 FileItemFactory factory = new DiskFileItemFactory();
			 ServletFileUpload upload = new ServletFileUpload(factory);
//			List<FileItem> fileItems = sfu.parseRequest(request);
//			
//			for(FileItem fileItem : fileItems ) {
//				
//				fileItem.write(new File("D:\\Maria\\Selenium\\Workspace\\ServletProject\\FileUpload\\"+fileItem.getName()));
//				
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
