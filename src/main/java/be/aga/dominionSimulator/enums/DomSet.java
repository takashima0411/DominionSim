package be.aga.dominionSimulator.enums;

import java.util.ArrayList;

public enum DomSet {
    Base(new DomCardName[]{DomCardName.Cellar
            , DomCardName.Chapel
            , DomCardName.Chancellor
            , DomCardName.Moat
            , DomCardName.Village
            , DomCardName.Woodcutter
            , DomCardName.Workshop
            , DomCardName.Bureaucrat
            , DomCardName.Feast
            , DomCardName.Gardens
            , DomCardName.Militia
            , DomCardName.Moneylender
            , DomCardName.Remodel
            , DomCardName.Smithy
            , DomCardName.Spy
            , DomCardName.Thief
            , DomCardName.ThroneRoom
            , DomCardName.CouncilRoom
            , DomCardName.Festival
            , DomCardName.Laboratory
            , DomCardName.Library
            , DomCardName.Market
            , DomCardName.Mine
            , DomCardName.Witch
            , DomCardName.Adventurer}),

    Intrigue(new DomCardName[]{DomCardName.Courtyard
            , DomCardName.Pawn
            , DomCardName.SecretChamber
            , DomCardName.GreatHall
            , DomCardName.Masquerade
            , DomCardName.ShantyTown
            , DomCardName.Steward
            , DomCardName.Swindler
            , DomCardName.WishingWell
            , DomCardName.Baron
            , DomCardName.Bridge
            , DomCardName.Conspirator
            , DomCardName.Coppersmith
            , DomCardName.Ironworks
            , DomCardName.MiningVillage
            , DomCardName.Scout
            , DomCardName.Duke
            , DomCardName.Minion
            , DomCardName.Saboteur
            , DomCardName.Torturer
            , DomCardName.TradingPost
            , DomCardName.Tribute
            , DomCardName.Upgrade
            , DomCardName.Harem
            , DomCardName.Nobles}),

    Seaside(new DomCardName[]{DomCardName.Embargo
            , DomCardName.Haven
            , DomCardName.Lighthouse
            , DomCardName.NativeVillage
            , DomCardName.PearlDiver
            , DomCardName.Ambassador
            , DomCardName.FishingVillage
            , DomCardName.Lookout
            , DomCardName.Smugglers
            , DomCardName.Warehouse
            , DomCardName.Caravan
            , DomCardName.Cutpurse
            , DomCardName.Island
            , DomCardName.Navigator
            , DomCardName.PirateShip
            , DomCardName.Salvager
            , DomCardName.SeaHag
            , DomCardName.TreasureMap
            , DomCardName.Bazaar
            , DomCardName.Explorer
            , DomCardName.GhostShip
            , DomCardName.MerchantShip
            , DomCardName.Outpost
            , DomCardName.Tactician
            , DomCardName.Treasury
            , DomCardName.Wharf}),

    Alchemy(new DomCardName[]{DomCardName.Transmute
            , DomCardName.Vineyard
            , DomCardName.Apothecary
            , DomCardName.Herbalist
            , DomCardName.ScryingPool
            , DomCardName.University
            , DomCardName.Alchemist
            , DomCardName.Familiar
            , DomCardName.PhilosophersStone
            , DomCardName.Golem
            , DomCardName.Apprentice
            , DomCardName.Possession}),

    Prosperity(new DomCardName[]{DomCardName.Loan
            , DomCardName.TradeRoute
            , DomCardName.Watchtower
            , DomCardName.Bishop
            , DomCardName.Monument
            , DomCardName.Quarry
            , DomCardName.Talisman
            , DomCardName.WorkersVillage
            , DomCardName.City
            , DomCardName.Contraband
            , DomCardName.CountingHouse
            , DomCardName.Mint
            , DomCardName.Mountebank
            , DomCardName.Rabble
            , DomCardName.RoyalSeal
            , DomCardName.Vault
            , DomCardName.Venture
            , DomCardName.Goons
            , DomCardName.GrandMarket
            , DomCardName.Hoard
            , DomCardName.Bank
            , DomCardName.Expand
            , DomCardName.Forge
            , DomCardName.KingsCourt
            , DomCardName.Peddler}),

    Cornucopia(new DomCardName[]{DomCardName.BagOfGold
            , DomCardName.Diadem
            , DomCardName.Followers
            , DomCardName.Princess
            , DomCardName.TrustySteed
            , DomCardName.Hamlet
            , DomCardName.FortuneTeller
            , DomCardName.Menagerie
            , DomCardName.FarmingVillage
            , DomCardName.HorseTraders
            , DomCardName.Remake
            , DomCardName.Tournament
            , DomCardName.YoungWitch
            , DomCardName.Harvest
            , DomCardName.HornOfPlenty
            , DomCardName.HuntingParty
            , DomCardName.Jester
            , DomCardName.Fairgrounds
    }),

    Hinterlands(new DomCardName[]{DomCardName.BorderVillage
            , DomCardName.Cache
            , DomCardName.Cartographer
            , DomCardName.Crossroads
            , DomCardName.Develop
            , DomCardName.Duchess
            , DomCardName.Embassy
            , DomCardName.Farmland
            , DomCardName.FoolsGold
            , DomCardName.Haggler
            , DomCardName.Highway
            , DomCardName.IllGottenGains
            , DomCardName.Inn
            , DomCardName.JackOfAllTrades
            , DomCardName.Mandarin
            , DomCardName.Margrave
            , DomCardName.NobleBrigand
            , DomCardName.NomadCamp
            , DomCardName.Oasis
            , DomCardName.Oracle
            , DomCardName.Scheme
            , DomCardName.SilkRoad
            , DomCardName.SpiceMerchant
            , DomCardName.Stables
            , DomCardName.Trader
            , DomCardName.Tunnel
    }),

    Promo(new DomCardName[]{DomCardName.BlackMarket
            , DomCardName.Envoy
            , DomCardName.Governor
            , DomCardName.WalledVillage
            , DomCardName.Stash}),

    Common(new DomCardName[]{DomCardName.Copper
            , DomCardName.Silver
            , DomCardName.Gold
            , DomCardName.Platinum
            , DomCardName.Potion
            , DomCardName.Curse
            , DomCardName.Estate
            , DomCardName.Duchy
            , DomCardName.Province
            , DomCardName.Colony
    }),;

    private final ArrayList<DomCardName> cards = new ArrayList<>();

    DomSet(DomCardName[] aCards) {
        for (DomCardName theCard : aCards) {
            cards.add(theCard);
        }
    }

    public boolean contains(DomCardName aCard) {
        return cards.contains(aCard);
    }

    public ArrayList<DomCardName> getCards() {
        return cards;
    }
}
