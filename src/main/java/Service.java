import com.google.gson.Gson;
import static spark.Spark.*;


public class Service {
    public static void main(String[] args) {
        get("/group/3", (req,res)->{
            Gson gson = new Gson();
            res.type("application/json");
            return gson.toJson(Data.getIntegrantes());
        });

        get("/group/3/student/:id", (req, res) -> {
            var integranteId = Integer.valueOf(req.params(":id"));
            Gson gson = new Gson();
            res.type("application/json");
            var integrante = Data.searchById(integranteId);
            if (integrante.isPresent()) {
                res.status(200);
            } else {
                halt(404);
            }
            return gson.toJson(integrante.get());
        });
    }
}
