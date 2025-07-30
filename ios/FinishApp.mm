#import "FinishApp.h"

@implementation FinishApp

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(exitApp:(nonnull NSNumber *)remove) {
    exit(0);
}

#if RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeFinishAppSpecJSI>(params);
}
#endif

@end
