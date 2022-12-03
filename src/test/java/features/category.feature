Feature: Category

  @cat

  Scenario Outline: As a user, I should be able to navigate computer category page successfully

    When I click on "<category_page>" link
    Then I should be able to navigate to related "<category_link>" page successfully

    Examples:
      | category_page      | category_link      |
      | Computers          |  computers         |
      | Electronics        |  electronics       |
      | Apparel            |  apparel           |
      | Digital downloads  |  digital-downloads |
      | Books              |  books             |
      | Jewelry            |  jewelry           |
      | Gift Cards         |  gift-cards        |

