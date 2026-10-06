## Purpose

Expose the bound NetEase account's actual liked podcast programs, subscribed radio collections and created radio collections in ordinary music mode, so users can choose their own podcast sources and play programs using the shared player.

## ADDED Requirements

### Requirement: Select personal NetEase podcast sources
The ordinary music workspace SHALL offer favourite sounds, subscribed podcast collections and the account's created podcast collections alongside public recommendations and search. “喜欢／收藏的声音” MUST represent the selectable NetEase voice favourite library, distinct from public thumbs-up counts.

#### Scenario: Select liked sounds
- **WHEN** a bound user selects liked sounds
- **THEN** their actual NetEase favourite programs are listed and can be selected for shared playback

#### Scenario: Select subscribed or created collections
- **WHEN** a bound user selects subscribed collections or their own podcast collections
- **THEN** the matching account collections are listed and opening one displays its actual programs

#### Scenario: No personal content or missing binding
- **WHEN** the chosen account source is empty or no account is bound
- **THEN** an accurate empty or binding state is shown without substituting public recommendations

### Requirement: Preserve podcast program identity
The library MUST distinguish a podcast program's resource identity from its playable main song, and program hearts MUST reflect NetEase voice favourites using the program subscribe/unsubscribe contract rather than music-song likes.

#### Scenario: Like or unlike a podcast program
- **WHEN** a user changes a podcast program's heart
- **THEN** the program like operation uses the program identity while playback continues to use its main song identity

### Requirement: Protect personal podcast data
Personal podcast reads and writes MUST use the current authenticated user's bound credentials, reject malformed upstream responses and discard obsolete responses after an account switch.

#### Scenario: Anonymous access
- **WHEN** a visitor requests personal podcast content or changes its likes
- **THEN** authentication is required while public podcast recommendations remain accessible

#### Scenario: Failure or account switch
- **WHEN** NetEase fails or the account changes during a personal podcast request
- **THEN** a failure is not reported as an empty successful library and old account data cannot replace new account data
