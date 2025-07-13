#ifdef RCT_NEW_ARCH_ENABLED
#import <FinishAppSpec/FinishAppSpec.h>

@interface FinishApp : NSObject <NativeFinishAppSpec>
#else
#import <React/RCTBridgeModule.h>

@interface FinishApp : NSObject <RCTBridgeModule>
#endif

@end
