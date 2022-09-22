package appiah.tacocloud;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.Class)

@Autowired
private MockMvc mockMvc;

@Test
public void testHomePage() throws Exception{
    mockMvc.perform(get("/"))
}
