package springmcvproductcurdapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import springmcvproductcurdapp.dao.ProductDao;
import springmcvproductcurdapp.entity.Product;

@Controller
public class MainController {
	
	@Autowired
	ProductDao productDao;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("productLst", productDao.fetchAllProduct());
		return "index";
	}
	@GetMapping("/add-product")
	public String addProductShow(Model model)
	{
		model.addAttribute("title","Add Product...");
		return "add-product";
	}
	
	@PostMapping("/handleAddProduct")
	public RedirectView handleDddProduct(@ModelAttribute Product product,HttpServletRequest req)
	{
		System.out.println("prod"+product);
		productDao.createProduct(product);
		RedirectView redView=new RedirectView();
		String path=req.getContextPath()+"/";
		redView.setUrl(path);
		return redView;
	}
	
	
	@GetMapping("/delete/{productId}")
	public RedirectView handleDeleteProduct(@PathVariable("productId") int productId,HttpServletRequest req)
	{
		System.out.println("prod del.."+productId);
		productDao.deleteProduct(productId);
		RedirectView redView=new RedirectView();
		String path=req.getContextPath()+"/";
		redView.setUrl(path);
		return redView;
	}
	
	@GetMapping("/update-product/{productId}")
	public String updateProductShow(@PathVariable("productId") int productId,Model model)
	{
		System.out.println("updating ..");
	
		model.addAttribute("product", productDao.fetchProduct(productId));
	
		
		return "update-product";
	}
	
	@PostMapping("/handleUpdateProduct")
	public RedirectView handleUpdateProduct(@ModelAttribute Product product,HttpServletRequest req)
	{
		
		System.out.println("handleUpdateProduct....**************.");
		System.out.println("procut"+product);
		productDao.UpdateProduct(product);
		RedirectView redView=new RedirectView();
		String path=req.getContextPath()+"/";
		redView.setUrl(path);
		return redView;
	}

}
