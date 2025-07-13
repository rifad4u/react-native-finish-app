# react-native-finish-app

React Native Package to kill and exit the application

## Installation

```sh
npm install react-native-finish-app
```

## Usage


```js
import { View, StyleSheet, Button } from "react-native";
import RNFinishApp from "react-native-finish-app";


export default function App() {

    return (
        <View style={styles.container}>
            <Button title="Exit App" onPress={() => RNFinishApp.exitApp(false)} />
        </View>
    );

};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: "center",
        justifyContent: "center"
    }
});
```


## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
