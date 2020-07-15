package xinlong;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xinlong.bean.Order;
import com.xinlong.bean.Product;
import com.xinlong.common.util.MyUtil;
import com.xinlong.dao.OrderMapper;
import com.xinlong.dao.ProductMapper;
import com.xinlong.service.OrderService;
import com.xinlong.service.ProductService;
import com.xinlong.vo.OrderVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CRUE {
    @Autowired
    ProductService productService;
   @Autowired
    OrderService orderService;
   @Autowired
   OrderMapper orderMapper;
   @Autowired
   ProductMapper productMapper;

    @Test
    public void select(){
        Page<Product> productsByPage = productService.getProductsByPage();
        productsByPage.getRecords().forEach(System.out::println);
        System.out.println("------------------");
        System.out.println(productsByPage.getTotal());

    }


    @Test
    public void addProduct(){
        Product product =new Product();
        product.setPid(10013L);
        product.setPname("小米");
        product.setPrice(2777L);
        product.setPimg("/static/p3.jpg");
        productService.addProduct(product);
    }


    @Test
    public void addProductInfo(){

        OrderVO orderVO=new OrderVO();
        Order order=new Order();
        order.setUserId(3L);
        order.setOrderPrice(998L);
        order.setOrderFlag(0L);
        order.setOrderId(Long.parseLong(MyUtil.getTime()));
        order.setOrderAddr("北京");
        order.setOrderUser("赵六");
        order.setOrderTel("15863513358");

        orderVO.setOrder(order);

        List<Product> products = productService.getProducts();
        orderVO.setProducts(products);

        orderService.addOrder(orderVO);


    }

}
