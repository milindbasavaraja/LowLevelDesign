# Command Design Pattern

Command Pattern allows you to decouple the requester of an action from the object that actually performs the action.

This can be done by using **command** objects. A **command** object encapsulates a request to do something on a specific object

**Client** : Responsible for creating the Command Object. The command Object consists of a set of actions on a receiver.

**Command** : The command object provides one method execute(), that encapsulates the actions and can be called to invoke the actions on the receiver.

**Invoker** : At some point in future the invoker calls the Command Object's execute() method.


In this module, we will be building Remote Control which could be used for various purposes like turning on/off light, Turning On/Off/increasing/decreasing fan speed etc.

