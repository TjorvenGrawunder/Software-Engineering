module DCCModule {
    exports DCCModule;
    requires SpeedControlSystemModule;
    provides SpeedControlSystemModule.SpeedProvider with DCCModule.DCC;
}