package com.jenew.broker;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

@DesignerComponent(
    version = 1,
    description = "JENEW embedded MQTT broker",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "images/extension.png"
)
@SimpleObject(external = true)
public class JENEWBroker extends AndroidNonvisibleComponent {

    private boolean running = false;

    public JENEWBroker(ComponentContainer container) {
        super(container.$form());
    }

    @SimpleFunction(description = "Check whether the broker is running.")
    public boolean IsRunning() {
        return running;
    }

    @SimpleFunction(description = "Start the embedded MQTT broker.")
    public void StartBroker() {
        // Actual MQTT broker integration comes next.
    }

    @SimpleFunction(description = "Stop the embedded MQTT broker.")
    public void StopBroker() {
        running = false;
    }
}
