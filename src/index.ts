import RNFinishApp from "./NativeFinishApp";

export const exitApp = (remove?: boolean) => {
    return RNFinishApp.exitApp(remove);
};

export default RNFinishApp;