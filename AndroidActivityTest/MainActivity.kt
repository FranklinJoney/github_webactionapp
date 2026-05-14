TopAppBar(
                        title = {
                            Text(
                                text = "Home",
                                color = Purple40,
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                        },
                        navigationIcon = {
                            IconButton(onClick = { }) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Default.ArrowBack,
                                    contentDescription = "Back"
                                )
                            }
                        },
                        actions = {
                            IconButton(onClick = {}) {
                                Icon(Icons.Default.Search,
                                    contentDescription = "Search")
                            }
                            IconButton(onClick = {}) {
                                Icon(Icons.Default.MoreVert,
                                    contentDescription = "More")
                            }
                        }
                    )
                    BottomNavigationBar(
                        modifier = Modifier.padding(innerPadding)
                    )

                    NavHost(
                        navController = navController,
                        startDestination = ReporteesListScreen,
                        modifier = Modifier.padding(innerPadding)
                    ){
                        composable<ReporteesListScreen> {

                        }
                    }
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )