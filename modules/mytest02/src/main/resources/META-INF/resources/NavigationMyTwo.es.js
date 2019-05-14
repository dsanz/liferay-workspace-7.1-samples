import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './NavigationMyTwo.soy';

/**
 * Navigation Component
 */
class NavigationMyTwo extends Component {}

// Register component
Soy.register(NavigationMyTwo, templates);

export default NavigationMyTwo;