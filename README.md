Splash Screen Tutorial App 🚀
Este repositório contém um aplicativo Android simples que demonstra como criar uma Splash Screen moderna e funcional para seu app. Ideal para desenvolvedores que desejam aprender ou aperfeiçoar suas habilidades na criação de telas de carregamento iniciais, este projeto utiliza boas práticas e ferramentas atualizadas no ecossistema Android.

🎯 Objetivo
Ensinar como implementar uma Splash Screen seguindo as recomendações atuais do Android, garantindo:

Transições suaves para a tela principal.
Carregamento eficiente de recursos durante o splash.
Design elegante e personalizável.
🛠️ Tecnologias Utilizadas
O projeto foi desenvolvido com as seguintes tecnologias:

Kotlin: Linguagem principal para desenvolvimento Android.
Jetpack Compose: Para criar a interface de forma declarativa.
Android SplashScreen API: Implementação moderna para telas iniciais (disponível a partir do Android 12).
Coroutines: Para lidar com tarefas assíncronas, como carregamento de dados.
Navigation Component: Para transitar entre a Splash Screen e as telas principais.
📱 Funcionalidades
Exibição de uma Splash Screen estilosa ao iniciar o app.
Temporizador simulando o carregamento inicial do aplicativo.
Transição fluida para a tela inicial do app.
Layout responsivo para diferentes tamanhos de tela.
🌟 Benefícios do Projeto
Este tutorial ajuda você a:

Entender o papel da Splash Screen em um app moderno.
Configurar e personalizar a SplashScreen API.
Aprender como melhorar a experiência do usuário com transições suaves.
Aplicar práticas recomendadas de design e performance.
📂 Estrutura do Projeto
perl
Copiar código
splash-screen-tutorial/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com.example.splashscreen/
│   │   │   │   │   ├── ui/    # Componentes de UI
│   │   │   │   │   ├── SplashScreenActivity.kt  # Lógica principal
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── drawable/
│   │   │   │   ├── values/
│   ├── build.gradle
│
├── README.md  # Descrição do projeto
🚀 Como Usar
Clone este repositório:
bash
Copiar código
git clone https://github.com/seu-usuario/splash-screen-tutorial.git
Importe o projeto no Android Studio.
Compile e execute no emulador ou dispositivo físico.
📋 Pré-requisitos
Android Studio Flamingo ou superior.
JDK 11 ou superior.
Gradle 8.x.
🎨 Personalização
Você pode personalizar:

Logotipo exibido.
Tempo de duração da Splash Screen.
Cores e estilos.
🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
