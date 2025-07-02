# Jellie Notes
© 2025 Cloudsurfe. All rights reserved.
![Frame 7(2)](https://github.com/user-attachments/assets/713ecc23-6bb3-4b45-b1eb-649417270b49)


![Status](https://img.shields.io/badge/status-under_development-orange)
![Platform](https://img.shields.io/badge/platform-Android-blue) <br>![Issues](https://img.shields.io/github/issues/CloudSurfe/JellyNotes)

Jellie Notes is an open-source, smart note-taking app from [**Cloudsurfe**](https://www.cloudsurfe.com). It helps you capture your ideas quickly and easily using natural language understanding. Whether you're making to-do lists, journaling, or writing a book, Jellie Notes uses handy templates to keep you organized and productive.

> **Currently available on Android**. iOS support is planned for a future release.

### Powered by ONNX Runtime
Jellie Notes runs AI models locally on the device using [ONNX Runtime](https://onnxruntime.ai/), enabling fast, private, and secure natural language processing without requiring an internet connection.
<p align="center">
  <img width="50%" src="https://github.com/user-attachments/assets/9da580c8-c00f-4577-826c-3d43e457406c" alt="ONNX Runtime logo dark" />
</p>

---
## Features
- Fast and effortless note-taking powered by natural language understanding  
- Built-in templates for to-dos, journaling, book writing, and more  
- Runs AI models locally on-device for privacy and offline use  
- Organizes your ideas into actionable notes quickly  
- Multi-device sync to keep your notes up-to-date across all your devices  
- Integrated plugin store featuring a variety of AI-powered tools and extensions  
- Support for advanced AI features such as custom NLP models and language generation  
- Open-source and continuously improving with community contributions

---
## Directory Structure

```plaintext
Jellie-Notes/
├── app/                   # Android app source code and resources
│   ├── src/               # Kotlin source files and assets
│   └── build.gradle       # App-level Gradle build configuration
├── baselineprofile/       # Performance baseline profiles for app optimization
├── editor/                # Markdown editor module
├── plugins/               # Trained NLP and LLM models/plugins
├── runtime/               # Tokenizers and runtime components
├── build.gradle           # Project-level Gradle build configuration
├── settings.gradle        # Gradle project settings and module declarations
├── LICENSE                # License information
└── README.md              # Project overview and documentation
```

---
## Community & contact

- [Github Discussion](https://github.com/CloudSurfe/Jellie-Notes/discussions). Ideal place to share ideas, ask questions, and discuss features.
- [GitHub Issues](https://github.com/CloudSurfe/Jellie-Notes/issues). Use this to report bugs or suggest improvements.
- [Discord](https://discord.gg/E9WqvF5H). Join the community to collaborate and connect with others.

**Contributors**

<a href="https://github.com/CloudSurfe/Jellie-Notes/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=CloudSurfe/Jellie-Notes" />
</a>

---

## Design Team (UI/UX)

Thanks to the amazing design team for creating the beautiful UI and user experience:
<table>
  <tbody>
    <tr>
      <td align="center">
        <a href="https://www.behance.net/angel_madueme#">
          <img src="https://mir-s3-cdn-cf.behance.net/user/115/120279896557085.662fbcc516a0d.jpg" width="100px;" alt="Angel Madueme"/>
          <br />
          <sub><b>Angel Madueme</b></sub>
        </a>
      </td>
      <td align="center">
        <a href="https://www.behance.net/pratyushkurup1#">
          <img src="https://mir-s3-cdn-cf.behance.net/user/115/1625901901758375.6776cc68561b1.jpg" width="100px;" alt="Pratyush Kurup"/>
          <br />
          <sub><b>Pratyush Kurup</b></sub>
        </a>
      </td>
      <td align="center">
        <a href="https://dribbble.com/nkrohit">
          <img src="https://cdn.dribbble.com/users/15988874/avatars/normal/be56edcc85269c84b5dbdbdb2d5ddaa1.jpg?1695371692" width="100px;" alt="Pratyush Kurup"/>
          <br />
          <sub><b>Nirmal Rohit</b></sub>
        </a>
      </td>
    </tr>
  </tbody>
</table>


---
## License
This project is licensed under the [GNU General Public License v3.0 (GPL-3.0)](https://choosealicense.com/licenses/gpl-3.0/).  
