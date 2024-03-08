Feature: Data table demo

  @List
  Scenario: Data table scenario for list
    Given I create data
      | Apple     |
      | Banana    |
      | Grapes    |
      | Pineapple |


  @Lists
  Scenario: Data table scenario for list of list
    Given I create lists
      | Apple     | Tomato  |
      | Banana    | Carrot  |
      | Grapes    | Cabbage |
      | Pineapple | Potato  |

  @Map
  Scenario: Data table scenario for list of list
    Given I create map
      | fruit  | Apple      |
      | veggie | Tomato     |
      | berry  | Strawberry |

  @Maps
  Scenario: Data table scenario for list of maps
    Given I create maps
      | fruit  | veggie | berry      |
      | Apple  | Tomato | Strawberry |
      | Banana | Onion  | Blueberry  |

