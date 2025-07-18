import type { TurboModule } from "react-native";
import { TurboModuleRegistry } from "react-native";

export interface Spec extends TurboModule {
    exitApp: (remove?: boolean) => void;
};

export default TurboModuleRegistry.getEnforcing<Spec>("FinishApp");