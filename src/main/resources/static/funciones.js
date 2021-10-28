function eliminar(id) {
	swal({
		title: "Estas seguro de Eliminar?",
		text: "Una vez eliminado no podrás volver a recuperar el dato.",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/eliminar/"+id,
					success: function(res){
						console.log(res);
					}
				});
				swal("Eliminación exitosa", {
					icon: "success",
				}).then((ok)=>{
					if(ok){
						location.href="/listar";
					}
				});
			} else {
				swal("Eliminación cancelada");
			}
		});
}