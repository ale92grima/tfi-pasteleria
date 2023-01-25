<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ver Pedido</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <section>
        <h1 style="color:#db2093;">Datos del pedido</h1>
        <p>ID pedido: ${p.getId()}</p>
        <p>Cliente: ${p.getNombreCliente()}</p>
        <p>Tipo pastel: ${p.getTipo()}</p>
        <p>Porciones: ${p.getPorciones()}</p>
        <p>Precio: ${p.getTotal()}</p>
        <a class="btn btn-sm btn-light text-white" type="button" href="index.html" style="background-color: #db2093;">Volver</a>

    </section>
</body>
</html>