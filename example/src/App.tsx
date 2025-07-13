import { View, StyleSheet, Button } from "react-native";
import RNFinishApp from "react-native-finish-app";


export default function App() {

    return (
        <View style={styles.container}>
            <Button title="Exit App" onPress={() => RNFinishApp.exitApp()} />
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