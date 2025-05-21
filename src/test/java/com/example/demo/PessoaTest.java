import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.Repository.DeficienciaRepository;
import com.example.demo.Repository.PessoaRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class PessoaTest{
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private PessoaRepository dr;

    @Test
    @DisplayName("adicione e altere pessoa/pessoa reponde 200(ok)")
    void caso1()void index() throws Exception {{
     
        mv.perform(
        post("pessoa/create")
        .contentType(MediaType.APLLICATION_FORM_URLENCODED)
        .param("nome","Teste1")
        .param("nascimento", "1999-11-30")
        .param("sexo", "1")
        .param("deficiencia", String.valueOf(d1.getid()))
        .param("logradouro", "Logradouro Exemmplo")
        .param("cep", "12345-678")
        .param()


     )           
    }
        mockMvc.perform(
                get("/pessoa")).andExpect(status().isOk());
            }
    


}