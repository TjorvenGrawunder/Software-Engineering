module ACCModule {
    exports ACCModule;
    requires SpeedControlSystemModule;
    provides SpeedControlSystemModule.SpeedProvider with ACCModule.ACC;
}