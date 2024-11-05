const axios= require('axios');

async function suma(a,b){
    const params ={
        a:a,
        b:b
    }
    console.log("ejecutando tarea en segundo plano")
    try{
        const response = await axios.get("http://localhost:8080/suma",{params});
        console.log("el proceso en backend se ha completado");
        console.log("resultado:", response.data);
    }catch(error){
        console.error(error.message);
    }
}

suma(3,4)
suma(1,2)