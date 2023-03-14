import org.junit.jupiter.api.Test;  
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;

import java.util.Date;
  
class Tests {

    private final VHotel vHotel = new VHotel();
    private final static Hotel hotel = new Hotel();
    static Date dateTest = new Date();

    @BeforeAll  
    public static void init() {  
          hotel.nuevaCategoria("test", 200, "categoría prueba");
          hotel.nuevoCliente("1234", "Iram", "Diaz", "Reyes", "test address", 412, dateTest, dateTest);
    }  

    @Test  
    public void testHabitacionOcupada() {  
          assertEquals(false, vHotel.habitacionOcupada(411));  
    }  

    @Test
    public void testTomarCategoria() {
        assertThat(hotel.tomarCategoria(0) , instanceOf(Categoria.class));
    }

    @Test
    public void test2TomarCategoria() {
        Categoria cat = hotel.tomarCategoria(0);
        assertThat(cat.idCategoria, equalTo("test"));  
        assertThat(cat.precioCategoria, equalTo(200)); 
        assertThat(cat.descripcionCategoria, equalTo("categoría prueba")); 
    }

    @Test 
    public void test3TomarCategoria() {
        Categoria cat = hotel.tomarCategoria(0);
        assertThat(cat.idCategoria, is(not("test not equal")));  
        assertThat(cat.precioCategoria, equalTo(200)); 
        assertThat(cat.descripcionCategoria, equalTo("categoría prueba")); 
    }

    @Test
    public void testTomarCliente() {
        assertNotNull(hotel.tomarCliente(0));
    }

}

