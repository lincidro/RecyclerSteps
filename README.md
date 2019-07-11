# RecyclerSteps
 Paso a paso para la creación de un RecyclerView
 
	RecyclerView:

	Pasos:
	1. Agregar la dependencia en gradle.
	2. Agregar el recyclerView al layout.
	3. Crear un solo xml para el item de la lista.
	3.1. Si existe un objeto, por ejm persona, crear el xml acorde a los valores 
			que se van a obtener del objeto.
	4. Crear un adapter.
	4.1. Crear solo la clase sin heredar ni implementar nada.
	4.2. Dentro crear una clase publica para el viewholder(extends RecyclerView.ViewHolder)
		 En el ViewHolder obtener los elementos de la vista, por ahora eso es todo para el VH.
	4.3. A la clase adapter : extends RecyclerView.Adapter<(Nombre del adapter).MyViewHolder>
		 e implementar los métodos que android studio nos solicita.
	4.4. Crear una variable de tipo lista para almacenar la lista de objetos y un constructor llamándolo.
		 por ejm: List<Persona> lista
	4.5. OnCreateViewHolder casi siempre es:
		 View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);
		 return new MyViewHolder(view);
	4.6. onBindViewHolder, set acorde a posicion.
	5. Ahora en el activity declaramos:
	   La lista de objetos, la vista del recyclerView y el adapter.
	6. Ejm para configurar el recycler:
		private void setupRecycler(){
			adapter = new PersonAdapterRecycler(personList);
			RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
			rv.setLayoutManager(manager); //rv es el recycler en la vista
			rv.setAdapter(adapter);
		}