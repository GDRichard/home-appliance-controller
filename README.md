# Home Appliance Controller

Basic Spring Boot application that uses a REST API to interact with a home appliance controller.
Controls a light, fan, and air conditioner. Each appliance has a `power` field that represents
whether the appliance is powered ON or OFF.

## Light

- `GET /light` returns the current state of the light switch (toggled ON or OFF).

> Example response from `GET /light`:
 ```json
{
    "power": "ON",
    "switchPosition": "ON"
}
```

- `PUT /light` updates the current light state and returns the new state.
- Takes a `LightRequest` object with an `switchPosition` (enum) field.
- Valid values for `switchPosition` are "ON" and "OFF".

> Example request for `PUT /light`:
```json
{
  "switchPosition": "OFF"
}
```

## Fan

- `GET /fan` returns the current state of the fan (speed of 0 - 2).

> Example response from `GET /fan`:
```json
{
    "power": "ON",
    "speed": 2
}
```

- `PUT /fan` updates the current fan state and returns the new state.
- Takes a `FanRequest` object with a `speed` (int) field.
- Valid values for `speed` are between 0 and 2 (inclusive).

> Example request body for `PUT /fan`:
```json
{
    "speed": 1
}
```

## Air Conditioner

- `GET /ac` returns the current state of the air conditioner (mode and temperature).

> Example response from `GET /ac`:
 ```json
{
    "power": "ON",
    "mode": "COOL",
    "temperature": 25
}
```

- `PUT /ac` updates the current air conditioner state and returns the new state.
- Takes a `AirConditionerRequest` object with the fields `mode` (enum) and `temperature` (int).
- Valid values for `mode` are "COOL", "HEAT", "DRY", "FAN", "AUTO", and "OFF".
- Valid values for `temperature` are between 16 and 30 (inclusive).

> Example request for `PUT /ac`:
```json
{
    "mode": "HEAT",
    "temperature": 21
}
```

## Yearly Update

Every year, on January 1st, 1:00am local time, the system updates and turns off all appliances:

```java
public class UpdateSystem {

    /* Initialization code... */

    // Jan 1, 1:00am local time, yearly
    @Scheduled(cron = "0 0 1 1 1 ?")
    public void runYearlyUpdate() {
        airConditionerService.powerOff();
        lightService.powerOff();
        fanService.powerOff();
    }

}
```
