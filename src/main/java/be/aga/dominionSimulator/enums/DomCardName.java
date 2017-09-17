package be.aga.dominionSimulator.enums;

import be.aga.dominionSimulator.*;
import be.aga.dominionSimulator.cards.*;
import be.aga.dominionSimulator.gui.EscapeDialog;

import java.net.URL;
import java.util.*;

public enum DomCardName {
    //common cards
    Copper(0, 0, 1, 0, 20, 15, new DomCardType[]{DomCardType.Treasure, DomCardType.Base}),
    Silver(3, 0, 2, 0, 25, 20, new DomCardType[]{DomCardType.Treasure, DomCardType.Base}),
    Gold(6, 0, 3, 0, 30, 31, new DomCardType[]{DomCardType.Treasure, DomCardType.Base}),
    Platinum(9, 0, 5, 0, 35, 33, new DomCardType[]{DomCardType.Treasure, DomCardType.Base}),
    Potion(4, 0, 0, 0, 40, 22, new DomCardType[]{DomCardType.Treasure, DomCardType.Base}),
    Estate(2, 0, 0, 1, 100, 9, new DomCardType[]{DomCardType.Victory, DomCardType.Base}),
    Duchy(5, 0, 0, 3, 100, 8, new DomCardType[]{DomCardType.Victory, DomCardType.Base}),
    Province(8, 0, 0, 6, 100, 7, new DomCardType[]{DomCardType.Victory, DomCardType.Base}),
    Colony(11, 0, 0, 10, 100, 6, new DomCardType[]{DomCardType.Victory, DomCardType.Base}),
    Curse(0, 0, 0, -1, 100, 10, new DomCardType[]{DomCardType.Curse, DomCardType.Base}),

    //kingdom cards
    AbandonedMine(0, 0, 0, 0, 58, 13, new DomCardType[]{DomCardType.Action, DomCardType.Ruins, DomCardType.Kingdom, DomCardType.Terminal}) {},
    Advance(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Adventurer(6, 0, 0, 0, 22, 40, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}) {},
    Advisor(4, 0, 0, 0, 7, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.CardAdvantage}),
    Alchemist(3, 1, 0, 0, 9, 40, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.CardAdvantage}),
    Alms(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Altar(6, 0, 0, 0, 27, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    Ambassador(3, 0, 0, 0, 35, 18, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    Amulet(3, 0, 1, 0, 25, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.Terminal}),
    Annex(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Apothecary(2, 1, 0, 0, 19, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.CardAdvantage}),
    Apprentice(5, 0, 0, 0, 20, 19, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Trasher, DomCardType.Cycler, DomCardType.CardAdvantage, DomCardType.TrashForBenefit}),
    Aqueduct(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Archive(5, 0, 0, 0, 9, 29, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.Cycler, DomCardType.CardAdvantage}),
    Arena(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Armory(4, 0, 0, 0, 38, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Artificer(5, 0, 1, 0, 12, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Artisan(6, 0, 0, 0, 30, 27, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Avanto(5, 0, 0, 0, 25, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage, DomCardType.SplitPile}),
    BagOfGold(0, 0, 0, 0, 7, 25, new DomCardType[]{DomCardType.Action, DomCardType.Prize}),
    Baker(5, 0, 1, 0, 12, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Ball(5, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    BandOfMisfits(5, 0, 0, 0, 12, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom}),
    Bandit(5, 0, 0, 0, 23, 23, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    BanditCamp(5, 0, 0, 0, 5, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    BanditFort(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Bank(7, 0, 0, 0, 1000, 30, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom}),
    Banquet(3, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Baron(4, 0, 4, 0, 22, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Basilica(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Baths(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Battlefield(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Bazaar(5, 0, 1, 0, 5, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Beggar(2, 0, 3, 0, 35, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Reaction}),
    Bishop(4, 0, 0, 0, 22, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.TrashForBenefit}),
    BlackMarket(3, 0, 2, 0, 32, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Bonfire(3, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    BorderVillage(6, 0, 0, 0, 5, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Borrow(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Bridge(4, 0, 2, 0, 25, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    BridgeTroll(5, 0, 1, 0, 25, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Attack, DomCardType.Duration}),
    Bureaucrat(4, 0, 0, 0, 29, 20, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    BustlingVillage(5, 0, 0, 0, 5, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village, DomCardType.SplitPile}),
    Butcher(5, 0, 2, 0, 19, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    Cache(5, 0, 3, 0, 100, 31, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom}),
    CandlestickMaker(2, 0, 1, 0, 7, 19, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom}),
    Capital(5, 0, 6, 0, 19, 25, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    Caravan(4, 0, 0, 0, 8, 27, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.Cycler, DomCardType.CardAdvantage}),
    CaravanGuard(3, 0, 1, 0, 8, 27, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.Cycler, DomCardType.Reaction}),
    Cartographer(5, 0, 0, 0, 19, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Catacombs(5, 0, 0, 0, 19, 32, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Catapult(3, 0, 0, 0, 37, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.Attack, DomCardType.SplitPile}),
    Castles(0, 0, 0, 0, 100, 13, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Castle, DomCardType.Victory, DomCardType.Treasure}),
    Cellar(2, 0, 0, 0, 16, 17, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Champion(6, 0, 0, 0, 0, 35, new DomCardType[]{DomCardType.Action, DomCardType.Duration}),
    Chancellor(3, 0, 2, 0, 30, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Chapel(2, 0, 0, 0, 37, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    ChariotRace(3, 0, 0, 0, 10, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Charm(5, 0, 0, 0, 500, 25, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    City(5, 0, 0, 0, 5, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    CityQuarter(0, 0, 0, 0, 2, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    CoinOfTheRealm(2, 0, 0, 0, 10, 22, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom, DomCardType.Reserve}),
    Colonnade(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Conquest(6, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Conspirator(4, 0, 2, 0, 35, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Contraband(5, 0, 3, 0, 5, 27, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom}),
    Coppersmith(4, 0, 0, 0, 26, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    CouncilRoom(5, 0, 0, 0, 25, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Count(5, 0, 3, 0, 25, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    Counterfeit(5, 0, 2, 0, 1, 27, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    CountingHouse(5, 0, 0, 0, 25, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Courtier(5, 0, 3, 0, 20, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom}),
    Courtyard(2, 0, 0, 0, 24, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Crossroads(2, 0, 0, 0, 3, 17, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village, DomCardType.CardAdvantage}),
    Crown(5, 0, 0, 0, 5, 27, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure, DomCardType.Multiplier, DomCardType.Action}),
    CrumblingCastle(4, 0, 0, 1, 0, 14, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Castle}),
    Cultist(5, 0, 0, 0, 18, 40, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage, DomCardType.Looter}),
    Cutpurse(4, 0, 2, 0, 32, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal}),
    DameAnna(5, 0, 0, 0, 25, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal, DomCardType.Trasher, DomCardType.Knight}),
    DameJosephine(5, 0, 0, 2, 30, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal, DomCardType.Victory, DomCardType.Knight}),
    DameMolly(5, 0, 0, 0, 5, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal, DomCardType.Village, DomCardType.Knight}),
    DameNatalie(5, 0, 0, 0, 25, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal, DomCardType.Knight}),
    DameSylvia(5, 0, 2, 0, 25, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal, DomCardType.Knight}),
    DeathCart(4, 0, 5, 0, 25, 23, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Looter}),
    DefiledShrine(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Delve(2, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Develop(3, 0, 0, 0, 33, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.TrashForBenefit}),
    Diadem(0, 0, 2, 0, 50, 30, new DomCardType[]{DomCardType.Prize, DomCardType.Treasure}),
    Diplomat(4, 0, 0, 0, 27, 35, new DomCardType[]{DomCardType.Action, DomCardType.Reaction, DomCardType.Kingdom, DomCardType.CardAdvantage}),
    Disciple(5, 0, 0, 0, 7, 25, new DomCardType[]{DomCardType.Action, DomCardType.Traveller, DomCardType.Multiplier}),
    DistantLands(5, 0, 0, 0, 25, 25, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Action}),
    Doctor(3, 0, 0, 0, 25, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    Dominate(14, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Donate(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Duchess(2, 0, 2, 0, 35, 19, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Duke(5, 0, 0, 3, 100, 8, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom}),
    Dungeon(3, 0, 0, 0, 10, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Duration}),
    Duplicate(4, 0, 0, 0, 30, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Reserve}),
    Embargo(2, 0, 2, 0, 25, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Embassy(5, 0, 0, 0, 25, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Emporium(5, 0, 1, 0, 13, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.SplitPile}),
    Encampment(2, 0, 0, 0, 5, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village, DomCardType.SplitPile}),
    Enchantress(3, 0, 0, 0, 22, 25, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Duration, DomCardType.CardAdvantage}),
    Engineer(0, 0, 0, 0, 38, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Envoy(4, 0, 0, 0, 24, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Expand(7, 0, 0, 0, 30, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.TrashForBenefit}) {},
    Expedition(3, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Explorer(5, 0, 0, 0, 37, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Fairgrounds(6, 0, 0, 0, 100, 7, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom}),
    Familiar(3, 1, 0, 0, 15, 40, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Cycler}),
    FarmersMarket(3, 0, 0, 0, 24, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Gathering}),
    FarmingVillage(4, 0, 0, 0, 3, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village, DomCardType.Cycler}),
    Farmland(6, 0, 0, 2, 100, 9, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom}),
    Feast(4, 0, 0, 0, 28, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Feodum(4, 0, 0, 0, 100, 7, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom}),
    Ferry(3, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Festival(5, 0, 2, 0, 3, 26, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village}),
    FishingVillage(3, 0, 1, 0, 3, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.Village}),
    Followers(0, 0, 0, 0, 18, 31, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Prize, DomCardType.Terminal, DomCardType.CardAdvantage}),
    FoolsGold(2, 0, 2, 0, 85, 27, new DomCardType[]{DomCardType.Reaction, DomCardType.Kingdom, DomCardType.Treasure}),
    Forager(3, 0, 0, 0, 17, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Trasher}),
    Forge(7, 0, 0, 0, 30, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.TrashForBenefit}),
    Fortress(4, 0, 0, 0, 5, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Fortune(8, 0, 0, 0, 1100, 29, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure, DomCardType.SplitPile}),
    FortuneTeller(3, 0, 2, 0, 33, 22, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Forum(5, 0, 0, 0, 8, 40, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Fountain(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Fugitive(4, 0, 0, 0, 17, 25, new DomCardType[]{DomCardType.Action, DomCardType.Traveller, DomCardType.Cycler}),
    Gardens(4, 0, 0, 0, 100, 9, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom}),
    Gear(3, 0, 0, 0, 21, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Duration, DomCardType.CardAdvantage}),
    GhostShip(5, 0, 0, 0, 21, 26, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Giant(5, 0, 1, 0, 22, 30, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Gladiator(3, 0, 2, 0, 28, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.SplitPile}),
    Golem(4, 1, 0, 0, 18, 40, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village, DomCardType.CardAdvantage}),
    Goons(6, 0, 2, 0, 20, 31, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Governor(5, 0, 0, 0, 9, 40, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.CardAdvantage, DomCardType.TrashForBenefit}),
    GrandCastle(9, 0, 0, 5, 0, 6, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Castle}),
    GrandMarket(6, 0, 2, 0, 12, 39, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Graverobber(5, 0, 0, 0, 30, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    GreatHall(3, 0, 0, 1, 5, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Victory, DomCardType.Cycler}),
    Groundskeeper(5, 0, 0, 0, 6, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Guide(3, 0, 0, 0, 4, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Reserve}),
    Haggler(5, 0, 2, 0, 24, 27, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Hamlet(2, 0, 0, 0, 5, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Harbinger(3, 0, 0, 0, 5, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Harem(6, 0, 2, 2, 55, 25, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Treasure}),
    Harvest(5, 0, 3, 0, 19, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    HauntedCastle(6, 0, 0, 2, 0, 8, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Castle}),
    HauntedWoods(5, 0, 0, 0, 21, 32, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Duration, DomCardType.CardAdvantage, DomCardType.Attack}),
    Haven(2, 0, 0, 0, 15, 19, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.Cycler}),
    Herald(4, 0, 0, 0, 5, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Herbalist(2, 0, 1, 0, 40, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Hermit(3, 0, 0, 0, 26, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    Hero(5, 0, 2, 0, 20, 29, new DomCardType[]{DomCardType.Action, DomCardType.Traveller}),
    Highway(5, 0, 1, 0, 7, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Hireling(6, 0, 0, 0, 22, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.CardAdvantage, DomCardType.Terminal}),
    Hoard(6, 0, 2, 0, 60, 32, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    HornOfPlenty(5, 0, 0, 0, 1001, 26, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    HorseTraders(4, 0, 1, 0, 29, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Reaction}),
    Hovel(1, 0, 0, 0, 29, 10, new DomCardType[]{DomCardType.Reaction, DomCardType.Shelter}),
    HumbleCastle(3, 0, 1, 0, 58, 20, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Treasure, DomCardType.Castle}),
    HuntingGrounds(6, 0, 0, 0, 19, 32, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    HuntingParty(5, 0, 0, 0, 13, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.CardAdvantage}),
    IllGottenGains(5, 0, 2, 0, 95, 15, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom}),
    Inheritance(7, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Inn(5, 0, 0, 0, 7, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Ironmonger(4, 0, 0, 0, 5, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Ironworks(4, 0, 0, 0, 25, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom}),
    Island(4, 0, 0, 2, 37, 22, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Action, DomCardType.Terminal}),
    JackOfAllTrades(4, 0, 0, 0, 20, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Jester(5, 0, 2, 0, 19, 26, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Journeyman(5, 0, 0, 0, 19, 32, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    JunkDealer(5, 0, 1, 0, 16, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Trasher}),
    Keep(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    KingsCastle(10, 0, 0, 0, 0, 4, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Castle}),
    KingsCourt(7, 0, 0, 0, 5, 34, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Multiplier}),
    Knights(5, 0, 0, 0, 100, 13, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Knight}),
    Laboratory(5, 0, 0, 0, 8, 40, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.CardAdvantage}),
    Labyrinth(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Legionary(5, 0, 3, 0, 28, 26, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Library(5, 0, 0, 0, 20, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Lighthouse(2, 0, 1, 0, 9, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration}),
    Loan(3, 0, 1, 0, 10, 17, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom}),
    Lookout(3, 0, 0, 0, 3, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom}),
    LostArts(6, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    LostCity(5, 0, 0, 0, 9, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village, DomCardType.CardAdvantage}),
    Lurker(2, 0, 0, 0, 17, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom}),
    Madman(0, 0, 0, 0, 1, 35, new DomCardType[]{DomCardType.Action, DomCardType.Village, DomCardType.CardAdvantage}),
    Magpie(4, 0, 0, 0, 7, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Mandarin(5, 0, 3, 0, 26, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Marauder(4, 0, 0, 0, 19, 27, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Looter}),
    Margrave(5, 0, 0, 0, 24, 26, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage, DomCardType.Attack}),
    Market(5, 0, 1, 0, 13, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    MarketSquare(3, 0, 0, 0, 12, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Masquerade(3, 0, 0, 0, 27, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage, DomCardType.Trasher}),
    Masterpiece(3, 0, 1, 0, 150, 14, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    Menagerie(3, 0, 0, 0, 1, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Cycler}),
    Mercenary(0, 0, 2, 0, 22, 25, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Terminal, DomCardType.Trasher}),
    Merchant(3, 0, 0, 0, 7, 19, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    MerchantGuild(5, 0, 1, 0, 19, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    MerchantShip(5, 0, 2, 0, 19, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Duration}),
    Messenger(4, 0, 2, 0, 28, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Militia(4, 0, 2, 0, 30, 25, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Mill(4, 0, 0, 1, 5, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Victory, DomCardType.Cycler}),
    Mine(5, 0, 0, 0, 24, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Minion(5, 0, 2, 0, 17, 40, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom}),
    MiningVillage(4, 0, 0, 0, 9, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village, DomCardType.Cycler}),
    Mint(5, 0, 0, 0, 40, 19, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Miser(4, 0, 0, 0, 23, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Mission(4, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Moat(2, 0, 0, 0, 33, 23, new DomCardType[]{DomCardType.Action, DomCardType.Reaction, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Moneylender(4, 0, 1, 0, 23, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Monument(4, 0, 2, 0, 22, 26, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    MountainPass(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Mountebank(5, 0, 2, 0, 18, 30, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Museum(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Mystic(5, 0, 2, 0, 15, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom}),
    NativeVillage(2, 0, 0, 0, 3, 17, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village}),
    Navigator(4, 0, 2, 0, 29, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Necropolis(1, 0, 0, 0, 5, 17, new DomCardType[]{DomCardType.Village, DomCardType.Action, DomCardType.Shelter}),
    NobleBrigand(4, 0, 1, 0, 23, 21, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    NomadCamp(4, 0, 2, 0, 29, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Nobles(6, 0, 0, 2, 12, 32, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Victory, DomCardType.Village, DomCardType.CardAdvantage}),
    Oasis(3, 0, 1, 0, 17, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Obelisk(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    OpulentCastle(7, 0, 0, 3, 27, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Victory, DomCardType.Castle}),
    Oracle(3, 0, 0, 0, 20, 22, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.CardAdvantage, DomCardType.Terminal}),
    Orchard(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Overlord(0, 0, 0, 0, 11, 29, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom}),
    Outpost(5, 0, 0, 0, 20, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.Terminal}),
    OvergrownEstate(1, 0, 0, 0, 0, 14, new DomCardType[]{DomCardType.Victory, DomCardType.Shelter}),
    Page(2, 0, 0, 0, 5, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Traveller}),
    Palace(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Pathfinding(8, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Patrician(2, 0, 0, 0, 4, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.SplitPile}),
    Patrol(5, 0, 0, 0, 19, 32, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Pawn(2, 0, 1, 0, 11, 17, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    PearlDiver(2, 0, 0, 0, 4, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Peasant(2, 0, 0, 0, 29, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Traveller, DomCardType.Terminal}),
    Peddler(8, 0, 1, 0, 10, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    PhilosophersStone(3, 1, 0, 0, 8, 30, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    Pilgrimage(4, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Pillage(5, 0, 2, 0, 27, 28, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    PirateShip(4, 0, 0, 0, 20, 20, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Plan(3, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Plaza(4, 0, 0, 0, 5, 17, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Plunder(5, 0, 2, 0, 35, 28, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure, DomCardType.SplitPile}),
    Poacher(4, 0, 1, 0, 10, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    PoorHouse(1, 0, 4, 0, 36, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Port(4, 0, 0, 0, 5, 17, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Possession(6, 1, 0, 0, 22, 45, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Prince(8, 0, 0, 0, 29, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Princess(0, 0, 2, 0, 23, 31, new DomCardType[]{DomCardType.Action, DomCardType.Prize, DomCardType.Terminal}),
    Procession(4, 0, 0, 0, 7, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Multiplier}),
    Quarry(4, 0, 3, 0, 65, 29, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    Quest(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Rabble(5, 0, 0, 0, 19, 29, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Raid(5, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Ranger(4, 0, 0, 0, 24, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Ratcatcher(2, 0, 0, 0, 8, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Trasher, DomCardType.Cycler}),
    Rats(4, 0, 0, 0, 15, 14, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Trasher, DomCardType.Cycler}),
    Raze(2, 0, 0, 0, 8, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Trasher, DomCardType.Cycler}),
    Rebuild(5, 0, 0, 0, 20, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom,}),
    Relic(5, 0, 2, 0, 5, 27, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom, DomCardType.Attack}),
    Remake(4, 0, 0, 0, 35, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.TrashForBenefit}),
    Remodel(4, 0, 0, 0, 24, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.TrashForBenefit}),
    Replace(5, 0, 0, 0, 30, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.TrashForBenefit}) {},
    Ritual(4, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Rocks(4, 0, 1, 0, 95, 15, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom, DomCardType.SplitPile}),
    Rogue(5, 0, 2, 0, 25, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal}),
    RoyalBlacksmith(0, 0, 0, 0, 20, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    RoyalCarriage(5, 0, 0, 0, 0, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Multiplier, DomCardType.Reserve}),
    RoyalSeal(5, 0, 2, 0, 70, 25, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    RuinedLibrary(0, 0, 0, 0, 55, 13, new DomCardType[]{DomCardType.Action, DomCardType.Ruins, DomCardType.Kingdom, DomCardType.Terminal}),
    RuinedMarket(0, 0, 0, 0, 60, 13, new DomCardType[]{DomCardType.Action, DomCardType.Ruins, DomCardType.Kingdom, DomCardType.Terminal}),
    RuinedVillage(0, 0, 0, 0, 60, 13, new DomCardType[]{DomCardType.Action, DomCardType.Ruins, DomCardType.Kingdom}),
    Ruins(0, 0, 0, 0, 100, 13, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Ruins}),
    Saboteur(5, 0, 0, 0, 20, 23, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Sacrifice(4, 0, 0, 0, 24, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    Sage(3, 0, 0, 0, 12, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    SalttTheEarth(4, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Salvager(4, 0, 0, 0, 25, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.TrashForBenefit}),
    Sauna(4, 0, 0, 0, 12, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Trasher, DomCardType.SplitPile}),
    Save(1, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Scavenger(4, 0, 2, 0, 30, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Scheme(3, 0, 0, 0, 10, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Scout(4, 0, 0, 0, 2, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    ScoutingParty(2, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    ScryingPool(2, 1, 0, 0, 7, 35, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.CardAdvantage, DomCardType.Attack}),
    SeaHag(4, 0, 0, 0, 19, 27, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Seaway(5, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    SecretChamber(2, 0, 0, 0, 40, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Reaction}),
    SecretPassage(4, 0, 0, 0, 12, 27, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Sentry(5, 0, 0, 0, 16, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Trasher}),
    Settlers(2, 0, 0, 0, 7, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.SplitPile}),
    ShantyTown(3, 0, 0, 0, 8, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village, DomCardType.CardAdvantage}),
    SilkRoad(4, 0, 0, 0, 100, 9, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom}),
    SirBailey(5, 0, 0, 0, 15, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Cycler, DomCardType.Knight}),
    SirDestry(5, 0, 0, 0, 24, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.CardAdvantage, DomCardType.Terminal, DomCardType.Knight}),
    SirMartin(4, 0, 0, 0, 29, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal, DomCardType.Knight}),
    SirMichael(5, 0, 0, 0, 25, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal, DomCardType.Knight}),
    SirVander(5, 0, 0, 0, 30, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal, DomCardType.Knight}),
    SmallCastle(5, 0, 0, 2, 29, 13, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Victory, DomCardType.Castle}),
    Smithy(4, 0, 0, 0, 25, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Smugglers(3, 0, 0, 0, 30, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Soldier(3, 0, 2, 0, 22, 25, new DomCardType[]{DomCardType.Action, DomCardType.Traveller, DomCardType.Terminal, DomCardType.Attack}),
    Soothsayer(5, 0, 0, 0, 18, 40, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    SpiceMerchant(4, 0, 0, 0, 9, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Spoils(0, 0, 0, 0, 30, 31, new DomCardType[]{DomCardType.Treasure}),
    SprawlingCastle(8, 0, 0, 4, 0, 7, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom, DomCardType.Castle}),
    Spy(4, 0, 0, 0, 5, 22, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Cycler}),
    Squire(2, 0, 1, 0, 5, 17, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village}),
    Stables(5, 0, 0, 0, 19, 26, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.CardAdvantage}),
    Stash(5, 0, 2, 0, 75, 23, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    Steward(3, 0, 2, 0, 27, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.CardAdvantage}),
    Stonemason(2, 0, 0, 0, 35, 17, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Trasher, DomCardType.Terminal}),
    Storeroom(3, 0, 0, 0, 30, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Storyteller(5, 0, 0, 0, 10, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Summon(5, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Survivors(0, 0, 0, 0, 59, 13, new DomCardType[]{DomCardType.Action, DomCardType.Ruins, DomCardType.Kingdom, DomCardType.Terminal}),
    SwampHag(5, 0, 3, 0, 19, 27, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Duration}),
    Swindler(3, 0, 2, 0, 25, 23, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    Tactician(5, 0, 0, 0, 19, 27, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Duration, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Talisman(4, 0, 1, 0, 80, 23, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    Tax(2, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Taxman(4, 0, 2, 0, 32, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Terminal}),
    Teacher(6, 0, 0, 0, 22, 30, new DomCardType[]{DomCardType.Action, DomCardType.Terminal, DomCardType.Reserve, DomCardType.Traveller}),
    Temple(4, 0, 0, 0, 37, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.Gathering}),
    Thief(4, 0, 0, 0, 30, 20, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),
    ThroneRoom(4, 0, 0, 0, 7, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Multiplier}),
    Tomb(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Torturer(5, 0, 0, 0, 20, 27, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Tournament(4, 0, 1, 0, 8, 31, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Tower(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Trade(5, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Trader(4, 0, 0, 0, 35, 14, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher, DomCardType.Reaction, DomCardType.TrashForBenefit}),
    TradeRoute(3, 0, 0, 0, 25, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    TradingPost(5, 0, 0, 0, 25, 24, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    Training(6, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Transmogrify(4, 0, 0, 0, 10, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Trasher, DomCardType.TrashForBenefit, DomCardType.Reserve}),
    Transmute(0, 1, 0, 0, 35, 19, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Trasher}),
    TravellingFair(2, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    TreasureHunter(3, 0, 1, 0, 7, 25, new DomCardType[]{DomCardType.Action, DomCardType.Traveller}),
    TreasureMap(4, 0, 0, 0, 20, 35, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    TreasureTrove(5, 0, 2, 0, 100, 25, new DomCardType[]{DomCardType.Treasure, DomCardType.Kingdom}),
    Treasury(5, 0, 1, 0, 15, 30, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Tribute(5, 0, 0, 0, 24, 26, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Triumph(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    TriumphalArch(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    TrustySteed(0, 0, 0, 0, 6, 45, new DomCardType[]{DomCardType.Action, DomCardType.Prize, DomCardType.Cycler, DomCardType.Village, DomCardType.CardAdvantage}),
    Tunnel(3, 0, 0, 2, 100, 0, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom}),
    University(2, 1, 0, 0, 5, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village}),
    Upgrade(5, 0, 0, 0, 16, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Trasher, DomCardType.TrashForBenefit}),
    Urchin(3, 0, 0, 0, 5, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Attack, DomCardType.Cycler}),
    Vagrant(2, 0, 0, 0, 4, 16, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Vassal(3, 0, 2, 0, 25, 21, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    Vault(5, 0, 0, 0, 20, 26, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    Venture(5, 0, 2, 0, 500, 29, new DomCardType[]{DomCardType.Kingdom, DomCardType.Treasure}),
    Villa(4, 0, 1, 0, 5, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village}),
    Village(3, 0, 0, 0, 5, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Vineyard(0, 1, 0, 0, 100, 7, new DomCardType[]{DomCardType.Victory, DomCardType.Kingdom}),
    Wall(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    WalledVillage(4, 0, 0, 0, 5, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    WanderingMinstrel(4, 0, 0, 0, 5, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler, DomCardType.Village}),
    Warehouse(3, 0, 0, 0, 10, 18, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Warrior(4, 0, 0, 0, 20, 23, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Terminal, DomCardType.Traveller, DomCardType.CardAdvantage}),
    Watchtower(3, 0, 0, 0, 27, 25, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Reaction, DomCardType.CardAdvantage}),
    Wedding(4, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    Wharf(5, 0, 0, 0, 19, 32, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.Duration, DomCardType.CardAdvantage}),
    WildHunt(5, 0, 0, 0, 19, 32, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage, DomCardType.Gathering}),
    Windfall(5, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Event}),
    WineMerchant(5, 0, 4, 0, 21, 28, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    WishingWell(3, 0, 0, 0, 6, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Cycler}),
    Witch(5, 0, 0, 0, 18, 40, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal, DomCardType.CardAdvantage}),
    WolfDen(0, 0, 0, 0, 0, 0, new DomCardType[]{DomCardType.Landmark}),
    Woodcutter(3, 0, 2, 0, 29, 20, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    WorkersVillage(4, 0, 0, 0, 3, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Village, DomCardType.Cycler}),
    Workshop(3, 0, 0, 0, 38, 22, new DomCardType[]{DomCardType.Action, DomCardType.Kingdom, DomCardType.Terminal}),
    YoungWitch(4, 0, 0, 0, 18, 26, new DomCardType[]{DomCardType.Action, DomCardType.Attack, DomCardType.Kingdom, DomCardType.Terminal}),;

    public static final Comparator SORT_FOR_TRASHING = new Comparator<DomCardName>() {
        @Override
        public int compare(DomCardName aO1, DomCardName aO2) {
            if (aO1.getTrashPriority() < aO2.getTrashPriority())
                return -1;
            if (aO1.getTrashPriority() > aO2.getTrashPriority())
                return 1;
            return 0;
        }
    };
    private final HashSet<DomCardType> types = new HashSet<>();
    private DomCost cost = null;
    private int coinValue;
    private int victoryValue;
    private int playPriority;
    private int discardPriority;

    DomCardName(int aCoinCost, int aPotionCost, int aCoinValue, int aVictoryValue, int aPlayPriority, int aDiscardPriority, DomCardType[] aTypes) {
        cost = new DomCost(aCoinCost, aPotionCost);
        coinValue = aCoinValue;
        victoryValue = aVictoryValue;
        playPriority = aPlayPriority;
        discardPriority = aDiscardPriority;
        for (DomCardType theType : aTypes) {
            types.add(theType);
        }
        //TODO Fix constructor to include debt cost
        if ("Donate".equals(name()) || "RoyalBlacksmith".equals(name()) || "Fortune".equals(name()) || "Overlord".equals(name()) || "Annex".equals(name()) || "CityQuarter".equals(name())) {
            cost.setDebt(8);
        }
        if ("Triumph".equals(name())) {
            cost.setDebt(5);
        }
        if ("Engineer".equals(name())) {
            cost.setDebt(4);
        }
        if ("Wedding".equals(name())) {
            cost.setDebt(3);
        }
    }

    public static DomCardName[] getSafeValues() {
        ArrayList<DomCardName> theValues = new ArrayList<>();
        for (DomCardName theCard : values()) {
            if (theCard.hasCardType(DomCardType.Knight) && theCard != Knights)
                continue;
            if (theCard.hasCardType(DomCardType.Castle) && theCard != Castles)
                continue;
            if (theCard.hasCardType(DomCardType.Ruins) && theCard != Ruins)
                continue;
            theValues.add(theCard);
        }
        if (DomEngine.developmentMode) {
            DomCardName[] theArr = new DomCardName[1];
            return (DomCardName[]) theValues.toArray(theArr);
        } else {
            ArrayList<DomCardName> theCards = new ArrayList<>();
            for (DomCardName theCard : theValues) {
                if (!theCard.hasCardType(DomCardType.DominionDevelopment))
                    theCards.add(theCard);
            }
            DomCardName[] theArr = new DomCardName[1];
            return (DomCardName[]) theCards.toArray(theArr);
        }
    }

    /**
     * @return
     */
    public boolean hasCardType(DomCardType aCardType) {
        return types.contains(aCardType);
    }

    public static List<DomCardName> getTreasures() {
        return Arrays.asList(DomCardName.Copper, DomCardName.Silver, DomCardName.Gold);
    }

    public static Object[] getPossibleBaneCards() {
        ArrayList<DomCardName> possibleBanes = new ArrayList<>();
        for (DomCardName cardName : values()) {
            if (cardName.getCost().compareTo(new DomCost(2, 0)) == 0
                    || cardName.getCost().compareTo(new DomCost(3, 0)) == 0) {
                if (cardName.hasCardType(DomCardType.Kingdom))
                    possibleBanes.add(cardName);
            }
        }
        return possibleBanes.toArray();
    }

    public static Object[] getKingdomCards() {
        ArrayList<DomCardName> theCards = new ArrayList<>();
        for (DomCardName cardName : values()) {
            if (!DomSet.Base.contains(cardName))
                theCards.add(cardName);
        }
        return theCards.toArray();
    }

    public HashSet<DomCardType> types() {
        return types;
    }

    public int countLegalCardTypes() {
        int theCount = 0;
        for (DomCardType domCardType : types) {
            theCount += domCardType.isLegal() ? 1 : 0;
        }
        return theCount;
    }

    public Object[] getPlayStrategies() {
        ArrayList<DomPlayStrategy> theStrategies = new ArrayList<>();
        switch (this) {
            case Ambassador:
                theStrategies.add(DomPlayStrategy.ambassadorWar);
                theStrategies.add(DomPlayStrategy.aggressiveTrashing);
                break;

            case Amulet:
                theStrategies.add(DomPlayStrategy.silverGainer);
                theStrategies.add(DomPlayStrategy.aggressiveTrashing);
                break;

            case Apothecary:
                theStrategies.add(DomPlayStrategy.ApothecaryNativeVillage);
                break;

            case Chapel:
                theStrategies.add(DomPlayStrategy.aggressiveTrashing);
                theStrategies.add(DomPlayStrategy.keepPayload);
                break;

            case Duplicate:
                theStrategies.add(DomPlayStrategy.dukeEnabler);
                break;

            case Governor:
                theStrategies.add(DomPlayStrategy.GoldEarlyTrashMid);
                break;

            case Hermit:
                theStrategies.add(DomPlayStrategy.MarketSquareCombo);
                theStrategies.add(DomPlayStrategy.bigTurnBridge);
                break;

            case Lurker:
                theStrategies.add(DomPlayStrategy.playOnlyIfGaining);
                break;

            case Mine:
                theStrategies.add(DomPlayStrategy.mineCopperFirst);
                break;

            case MiningVillage:
                theStrategies.add(DomPlayStrategy.forEngines);
                break;

            case Miser:
                theStrategies.add(DomPlayStrategy.removeAllCoppers);
                break;

            case Mystic:
                theStrategies.add(DomPlayStrategy.goodDeckTracker);
                theStrategies.add(DomPlayStrategy.greedyDeckTracker);
                break;

            case NativeVillage:
                theStrategies.add(DomPlayStrategy.bigTurnBridge);
                theStrategies.add(DomPlayStrategy.bigTurnGoons);
                theStrategies.add(DomPlayStrategy.ApothecaryNativeVillage);
                break;

            case Necropolis:
                theStrategies.add(DomPlayStrategy.trashWhenObsolete);
                break;

            case Peddler:
                theStrategies.add(DomPlayStrategy.combo);
                break;

            case PirateShip:
                theStrategies.add(DomPlayStrategy.attackUntil5Coins);
                break;

            case Ratcatcher:
                theStrategies.add(DomPlayStrategy.aggressiveTrashing);
                break;

            case RoyalCarriage:
                theStrategies.add(DomPlayStrategy.bigTurnBridge);
                break;

            case Silver:
                theStrategies.add(DomPlayStrategy.trashWhenObsolete);
                break;

            case Smithy:
                theStrategies.add(DomPlayStrategy.playIfNotBuyingTopCard);
                break;

            case SpiceMerchant:
                theStrategies.add(DomPlayStrategy.FoolsGoldEnabler);
                break;

            case Squire:
                theStrategies.add(DomPlayStrategy.silverGainer);
                break;

            case Steward:
                theStrategies.add(DomPlayStrategy.modestTrashing);
                break;

            case Stonemason:
                theStrategies.add(DomPlayStrategy.combo);
                break;

            case Storeroom:
                theStrategies.add(DomPlayStrategy.cityQuarterCombo);

            case Tactician:
                theStrategies.add(DomPlayStrategy.playIfNotBuyingTopCard);
                break;

            case WildHunt:
                theStrategies.add(DomPlayStrategy.forEngines);
                break;

            case WishingWell:
                theStrategies.add(DomPlayStrategy.goodDeckTracker);
                theStrategies.add(DomPlayStrategy.greedyDeckTracker);
                break;

            default:
                break;
        }
        theStrategies.add(0, DomPlayStrategy.standard);
        return theStrategies.toArray();
    }

    /**
     * @return
     */
    public int getVictoryValue(DomPlayer aPlayer) {
        switch (this) {
            case Duke:
                if (aPlayer != null) {
                    return aPlayer.countInDeck(Duchy);
                }
                break;

            case Fairgrounds:
                if (aPlayer != null) {
                    return aPlayer.countDifferentCardsInDeck() / 5 * 2;
                }
                break;

            case Feodum:
                if (aPlayer != null) {
                    return aPlayer.countInDeck(Silver) / 3;
                }
                break;

            case Gardens:
                if (aPlayer != null) {
                    return aPlayer.countAllCards() / 10;
                }
                break;

            case HumbleCastle:
                if (aPlayer != null) {
                    return aPlayer.count(DomCardType.Castle);
                }
                break;

            case KingsCastle:
                if (aPlayer != null) {
                    return aPlayer.count(DomCardType.Castle) * 2;
                }
                break;

            case SilkRoad:
                if (aPlayer != null) {
                    return aPlayer.count(DomCardType.Victory) / 4;
                }
                break;

            case Vineyard:
                if (aPlayer != null) {
                    return aPlayer.count(DomCardType.Action) / 3;
                }
                break;

            default:
                break;
        }
        return victoryValue;
    }

    /**
     * @return
     */
    public int getCoinValue() {
        return coinValue;
    }

    /**
     * @return
     */
    public int getPlayPriority() {
        return playPriority;
    }

    /**
     * @return
     */
    public int getTrashPriority() {
        return getDiscardPriority(1);
    }

    /**
     * @param aActionsLeft
     * @return
     */
    public int getDiscardPriority(int aActionsLeft) {
        //TODO to review (warehouse draws village + Terminal...)
        if (aActionsLeft < 1 && hasCardType(DomCardType.Action))
            return 1;
        return discardPriority;
    }

    /**
     * @return
     */
    public final DomCost getCost(DomGame aDomGame) {
        DomCost theCost = new DomCost(getCoinCost(aDomGame), getPotionCost());
        theCost.setDebt(cost.getDebt());
        return theCost;
    }

    public final int getCoinCost(DomGame aDomGame) {
        if (hasCardType(DomCardType.Event))
            return getCost().getCoins();
        int theCoins = getCost().getCoins();
        if (aDomGame != null) {
            if (this == DomCardName.Peddler && aDomGame.isBuyPhase()) {
                theCoins -= aDomGame.countActionsInPlay() * 2;
            }
            theCoins -= aDomGame.getBridgesPlayed();
            theCoins -= aDomGame.getPrincessesInPlay() * 2;
            if (hasCardType(DomCardType.Action))
                theCoins -= aDomGame.getQuarriesPlayed() * 2;
            theCoins -= aDomGame.getHighwaysInPlay();
            theCoins -= aDomGame.getBridgeTrollsInPlay();
            theCoins -= aDomGame.getActivePlayer().getMinus$2TokenOn() == isFromPile() ? 2 : 0;
        }
        return theCoins < 0 ? 0 : theCoins;
    }

    public DomCost getCost() {
        return cost;
    }

    public DomCardName isFromPile() {
        if (hasCardType(DomCardType.SplitPile)) {
            switch (this) {
                case Settlers:
                case BustlingVillage:
                    return DomCardName.Settlers;
                case Catapult:
                case Rocks:
                    return DomCardName.Catapult;
                case Patrician:
                case Emporium:
                    return DomCardName.Patrician;
                case Encampment:
                case Plunder:
                    return DomCardName.Encampment;
                case Gladiator:
                case Fortune:
                    return DomCardName.Gladiator;
                case Sauna:
                case Avanto:
                    return DomCardName.Sauna;

            }
        }

        if (hasCardType(DomCardType.Ruins))
            return DomCardName.Ruins;

        if (hasCardType(DomCardType.Knight))
            return DomCardName.Knights;

        if (hasCardType(DomCardType.Castle))
            return DomCardName.Castles;

        return this;
    }

    /**
     * @return
     */
    public final int getPotionCost() {
        return getCost().getPotions();
    }

    public int getTrashPriority(DomPlayer player) {
        //trash priorities depend on the owner of the card which is unknown in this enum
        //so we quickly make a DomCard object and assign it to the player
        //this way we get a correct trash priority for that player
        DomCard theIntermediateCard = createNewCardInstance();
        theIntermediateCard.owner = player.getPossessor() == null ? player : player.getPossessor();
        return theIntermediateCard.getTrashPriority();
    }

    public DomCard createNewCardInstance() {
        //TODO look into Dynamic Class Loading (tried it, but took way too long)
        switch (this) {
            case AbandonedMine:
                return new AbandonedMineCard();
            case Advance:
                return new AdvanceCard();
            case Adventurer:
                return new AdventurerCard();
            case Advisor:
                return new AdvisorCard();
            case Alchemist:
                return new AlchemistCard();
            case Alms:
                return new AlmsCard();
            case Altar:
                return new AltarCard();
            case Ambassador:
                return new AmbassadorCard();
            case Amulet:
                return new AmuletCard();
            case Annex:
                return new AnnexCard();
            case Apprentice:
                return new ApprenticeCard();
            case Apothecary:
                return new ApothecaryCard();
            case Archive:
                return new ArchiveCard();
            case Armory:
                return new ArmoryCard();
            case Artificer:
                return new ArtificerCard();
            case Artisan:
                return new ArtisanCard();
            case Avanto:
                return new AvantoCard();
            case BagOfGold:
                return new BagofGoldCard();
            case Baker:
                return new BakerCard();
            case Ball:
                return new BallCard();
            case BandOfMisfits:
                return new BandOfMisfitsCard();
            case Bandit:
                return new BanditCard();
            case BanditCamp:
                return new BanditCampCard();
            case Bank:
                return new BankCard();
            case Banquet:
                return new BanquetCard();
            case Baron:
                return new BaronCard();
            case Bazaar:
                return new BazaarCard();
            case Beggar:
                return new BeggarCard();
            case Bishop:
                return new BishopCard();
            case BlackMarket:
                return new BlackMarketCard();
            case Bonfire:
                return new BonfireCard();
            case BorderVillage:
                return new BorderVillageCard();
            case Borrow:
                return new BorrowCard();
            case Bridge:
                return new BridgeCard();
            case BridgeTroll:
                return new BridgeTrollCard();
            case Bureaucrat:
                return new BureaucratCard();
            case BustlingVillage:
                return new BustlingVillageCard();
            case Butcher:
                return new ButcherCard();
            case Cache:
                return new CacheCard();
            case CandlestickMaker:
                return new CandlestickMakerCard();
            case Capital:
                return new CapitalCard();
            case Caravan:
                return new CaravanCard();
            case CaravanGuard:
                return new CaravanGuardCard();
            case Cartographer:
                return new CartographerCard();
            case Catacombs:
                return new CatacombsCard();
            case Catapult:
                return new CatapultCard();
            case Cellar:
                return new CellarCard();
            case Champion:
                return new ChampionCard();
            case Chancellor:
                return new ChancellorCard();
            case Chapel:
                return new ChapelCard();
            case ChariotRace:
                return new ChariotRaceCard();
            case Charm:
                return new CharmCard();
            case City:
                return new CityCard();
            case CityQuarter:
                return new CityQuarterCard();
            case CoinOfTheRealm:
                return new CoinOfTheRealmCard();
            case Colony:
                return new ColonyCard();
            case Conquest:
                return new ConquestCard();
            case Conspirator:
                return new ConspiratorCard();
            case Contraband:
                return new ContrabandCard();
            case Copper:
                return new CopperCard();
            case Coppersmith:
                return new CoppersmithCard();
            case CouncilRoom:
                return new CouncilRoomCard();
            case Count:
                return new CountCard();
            case Counterfeit:
                return new CounterfeitCard();
            case CountingHouse:
                return new CountingHouseCard();
            case Courtier:
                return new CourtierCard();
            case Courtyard:
                return new CourtyardCard();
            case Crossroads:
                return new CrossroadsCard();
            case Crown:
                return new CrownCard();
            case CrumblingCastle:
                return new CrumblingCastleCard();
            case Cultist:
                return new CultistCard();
            case Curse:
                return new CurseCard();
            case Cutpurse:
                return new CutpurseCard();
            case DameAnna:
                return new DameAnnaCard();
            case DameJosephine:
                return new DameJosephineCard();
            case DameMolly:
                return new DameMollyCard();
            case DameNatalie:
                return new DameNatalieCard();
            case DameSylvia:
                return new DameSylviaCard();
            case DeathCart:
                return new DeathCartCard();
            case Delve:
                return new DelveCard();
            case Develop:
                return new DevelopCard();
            case Diadem:
                return new DiademCard();
            case Diplomat:
                return new DiplomatCard();
            case Disciple:
                return new DiscipleCard();
            case DistantLands:
                return new DistantLandsCard();
            case Doctor:
                return new DoctorCard();
            case Dominate:
                return new DominateCard();
            case Donate:
                return new DonateCard();
            case Duchess:
                return new DuchessCard();
            case Duchy:
                return new DuchyCard();
            case Duke:
                return new DukeCard();
            case Dungeon:
                return new DungeonCard();
            case Duplicate:
                return new DuplicateCard();
            case Embargo:
                return new EmbargoCard();
            case Embassy:
                return new EmbassyCard();
            case Emporium:
                return new EmporiumCard();
            case Encampment:
                return new EncampmentCard();
            case Enchantress:
                return new EnchantressCard();
            case Engineer:
                return new EngineerCard();
            case Envoy:
                return new EnvoyCard();
            case Estate:
                return new EstateCard();
            case Expand:
                return new ExpandCard();
            case Expedition:
                return new ExpeditionCard();
            case Explorer:
                return new ExplorerCard();
            case Fairgrounds:
                return new FairgroundsCard();
            case FarmersMarket:
                return new FarmersMarketCard();
            case FarmingVillage:
                return new FarmingVillageCard();
            case Farmland:
                return new FarmlandCard();
            case Familiar:
                return new FamiliarCard();
            case Feast:
                return new FeastCard();
            case Feodum:
                return new FeodumCard();
            case Ferry:
                return new FerryCard();
            case Festival:
                return new FestivalCard();
            case FishingVillage:
                return new FishingVillageCard();
            case FoolsGold:
                return new FoolsGoldCard();
            case Followers:
                return new FollowersCard();
            case Forager:
                return new ForagerCard();
            case Forge:
                return new ForgeCard();
            case Fortress:
                return new FortressCard();
            case Fortune:
                return new FortuneCard();
            case FortuneTeller:
                return new FortuneTellerCard();
            case Forum:
                return new ForumCard();
            case Fugitive:
                return new FugitiveCard();
            case Gardens:
                return new GardensCard();
            case Gear:
                return new GearCard();
            case GhostShip:
                return new GhostShipCard();
            case Giant:
                return new GiantCard();
            case Gladiator:
                return new GladiatorCard();
            case Gold:
                return new GoldCard();
            case Golem:
                return new GolemCard();
            case Goons:
                return new GoonsCard();
            case Governor:
                return new GovernorCard();
            case GrandCastle:
                return new GrandCastleCard();
            case GrandMarket:
                return new GrandMarketCard();
            case Graverobber:
                return new GraverobberCard();
            case GreatHall:
                return new GreatHallCard();
            case Groundskeeper:
                return new GroundskeeperCard();
            case Guide:
                return new GuideCard();
            case Haggler:
                return new HagglerCard();
            case Hamlet:
                return new HamletCard();
            case Harbinger:
                return new HarbingerCard();
            case Harem:
                return new HaremCard();
            case Harvest:
                return new HarvestCard();
            case HauntedCastle:
                return new HauntedCastleCard();
            case HauntedWoods:
                return new HauntedWoodsCard();
            case Haven:
                return new HavenCard();
            case Herald:
                return new HeraldCard();
            case Herbalist:
                return new HerbalistCard();
            case Hermit:
                return new HermitCard();
            case Hero:
                return new HeroCard();
            case Highway:
                return new HighwayCard();
            case Hireling:
                return new HirelingCard();
            case Hoard:
                return new HoardCard();
            case HornOfPlenty:
                return new HornOfPlentyCard();
            case HorseTraders:
                return new HorseTradersCard();
            case Hovel:
                return new HovelCard();
            case HumbleCastle:
                return new HumbleCastleCard();
            case HuntingGrounds:
                return new HuntingGroundsCard();
            case HuntingParty:
                return new HuntingPartyCard();
            case Inheritance:
                return new InheritanceCard();
            case Inn:
                return new InnCard();
            case IllGottenGains:
                return new IllGottenGainsCard();
            case Ironmonger:
                return new IronmongerCard();
            case Ironworks:
                return new IronworksCard();
            case Island:
                return new IslandCard();
            case JackOfAllTrades:
                return new JackOfAllTradesCard();
            case Jester:
                return new JesterCard();
            case Journeyman:
                return new JourneymanCard();
            case JunkDealer:
                return new JunkDealerCard();
            case KingsCastle:
                return new KingsCastleCard();
            case KingsCourt:
                return new KingsCourtCard();
            case Laboratory:
                return new LaboratoryCard();
            case Legionary:
                return new LegionaryCard();
            case Library:
                return new LibraryCard();
            case Lighthouse:
                return new LighthouseCard();
            case Loan:
                return new LoanCard();
            case Lookout:
                return new LookoutCard();
            case LostArts:
                return new LostArtsCard();
            case LostCity:
                return new LostCityCard();
            case Lurker:
                return new LurkerCard();
            case Madman:
                return new MadmanCard();
            case Magpie:
                return new MagpieCard();
            case Mandarin:
                return new MandarinCard();
            case Marauder:
                return new MarauderCard();
            case Margrave:
                return new MargraveCard();
            case Market:
                return new MarketCard();
            case MarketSquare:
                return new MarketSquareCard();
            case Masquerade:
                return new MasqueradeCard();
            case Masterpiece:
                return new MasterpieceCard();
            case Menagerie:
                return new MenagerieCard();
            case Merchant:
                return new MerchantCard();
            case MerchantGuild:
                return new MerchantGuildCard();
            case MerchantShip:
                return new MerchantShipCard();
            case Mercenary:
                return new MercenaryCard();
            case Messenger:
                return new MessengerCard();
            case Militia:
                return new MilitiaCard();
            case Mill:
                return new MillCard();
            case Mine:
                return new MineCard();
            case Minion:
                return new MinionCard();
            case MiningVillage:
                return new MiningVillageCard();
            case Mint:
                return new MintCard();
            case Miser:
                return new MiserCard();
            case Mission:
                return new MissionCard();
            case Moat:
                return new MoatCard();
            case Moneylender:
                return new MoneylenderCard();
            case Monument:
                return new MonumentCard();
            case Mountebank:
                return new MountebankCard();
            case Mystic:
                return new MysticCard();
            case NativeVillage:
                return new NativeVillageCard();
            case Navigator:
                return new NavigatorCard();
            case Necropolis:
                return new NecropolisCard();
            case Patrol:
                return new PatrolCard();
            case NobleBrigand:
                return new NobleBrigandCard();
            case NomadCamp:
                return new NomadCampCard();
            case Nobles:
                return new NoblesCard();
            case Oasis:
                return new OasisCard();
            case OpulentCastle:
                return new OpulentCastleCard();
            case Oracle:
                return new OracleCard();
            case Outpost:
                return new OutpostCard();
            case OvergrownEstate:
                return new OvergrownEstateCard();
            case Overlord:
                return new OverlordCard();
            case Page:
                return new PageCard();
            case Pathfinding:
                return new PathfindingCard();
            case Patrician:
                return new PatricianCard();
            case Pawn:
                return new PawnCard();
            case PearlDiver:
                return new PearlDiverCard();
            case Peasant:
                return new PeasantCard();
            case Peddler:
                return new PeddlerCard();
            case PhilosophersStone:
                return new PhilosophersStoneCard();
            case Pilgrimage:
                return new PilgrimageCard();
            case Pillage:
                return new PillageCard();
            case PirateShip:
                return new PirateShipCard();
            case Plan:
                return new PlanCard();
            case Plaza:
                return new PlazaCard();
            case Plunder:
                return new PlunderCard();
            case Poacher:
                return new PoacherCard();
            case PoorHouse:
                return new PoorHouseCard();
            case Port:
                return new PortCard();
            case Possession:
                return new PossessionCard();
            case Potion:
                return new PotionCard();
            case Prince:
                return new PrinceCard();
            case Princess:
                return new PrincessCard();
            case Procession:
                return new ProcessionCard();
            case Province:
                return new ProvinceCard();
            case Quarry:
                return new QuarryCard();
            case Quest:
                return new QuestCard();
            case Rabble:
                return new RabbleCard();
            case Raid:
                return new RaidCard();
            case Ranger:
                return new RangerCard();
            case Ratcatcher:
                return new RatcatcherCard();
            case Rats:
                return new RatsCard();
            case Raze:
                return new RazeCard();
            case Rebuild:
                return new RebuildCard();
            case Relic:
                return new RelicCard();
            case Remake:
                return new RemakeCard();
            case Remodel:
                return new RemodelCard();
            case Replace:
                return new ReplaceCard();
            case Ritual:
                return new RitualCard();
            case Rocks:
                return new RocksCard();
            case Rogue:
                return new RogueCard();
            case RoyalBlacksmith:
                return new RoyalBlacksmithCard();
            case RoyalCarriage:
                return new RoyalCarriageCard();
            case RoyalSeal:
                return new RoyalSealCard();
            case RuinedMarket:
                return new RuinedMarketCard();
            case RuinedLibrary:
                return new RuinedLibraryCard();
            case RuinedVillage:
                return new RuinedVillageCard();
            case Saboteur:
                return new SaboteurCard();
            case Sacrifice:
                return new SacrificeCard();
            case Sage:
                return new SageCard();
            case SalttTheEarth:
                return new SaltTheEarthCard();
            case Salvager:
                return new SalvagerCard();
            case Save:
                return new SaveCard();
            case Sauna:
                return new SaunaCard();
            case Scavenger:
                return new ScavengerCard();
            case Scheme:
                return new SchemeCard();
            case Scout:
                return new ScoutCard();
            case ScoutingParty:
                return new ScoutingPartyCard();
            case ScryingPool:
                return new ScryingPoolCard();
            case SeaHag:
                return new SeaHagCard();
            case Seaway:
                return new SeawayCard();
            case SecretChamber:
                return new SecretChamberCard();
            case SecretPassage:
                return new SecretPassageCard();
            case Sentry:
                return new SentryCard();
            case Settlers:
                return new SettlersCard();
            case ShantyTown:
                return new ShantyTownCard();
            case SilkRoad:
                return new SilkRoadCard();
            case Silver:
                return new SilverCard();
            case SirBailey:
                return new SirBaileyCard();
            case SirDestry:
                return new SirDestryCard();
            case SirMartin:
                return new SirMartinCard();
            case SirMichael:
                return new SirMichaelCard();
            case SirVander:
                return new SirVanderCard();
            case SmallCastle:
                return new SmallCastleCard();
            case Smithy:
                return new SmithyCard();
            case Smugglers:
                return new SmugglersCard();
            case Soldier:
                return new SoldierCard();
            case Soothsayer:
                return new SoothsayerCard();
            case SpiceMerchant:
                return new SpiceMerchantCard();
            case Spoils:
                return new SpoilsCard();
            case SprawlingCastle:
                return new SprawlingCastleCard();
            case Spy:
                return new SpyCard();
            case Squire:
                return new SquireCard();
            case Stables:
                return new StablesCard();
            case Stash:
                return new StashCard();
            case Steward:
                return new StewardCard();
            case Stonemason:
                return new StonemasonCard();
            case Storeroom:
                return new StoreroomCard();
            case Storyteller:
                return new StorytellerCard();
            case Summon:
                return new SummonCard();
            case Survivors:
                return new SurvivorsCard();
            case SwampHag:
                return new SwampHagCard();
            case Swindler:
                return new SwindlerCard();
            case Tactician:
                return new TacticianCard();
            case Talisman:
                return new TalismanCard();
            case Tax:
                return new TaxCard();
            case Taxman:
                return new TaxmanCard();
            case Teacher:
                return new TeacherCard();
            case Temple:
                return new TempleCard();
            case Thief:
                return new ThiefCard();
            case ThroneRoom:
                return new ThroneRoomCard();
            case Torturer:
                return new TorturerCard();
            case Tournament:
                return new TournamentCard();
            case Trade:
                return new TradeCard();
            case Trader:
                return new TraderCard();
            case TradeRoute:
                return new TradeRouteCard();
            case TradingPost:
                return new TradingPostCard();
            case Training:
                return new TrainingCard();
            case Transmogrify:
                return new TransmogrifyCard();
            case Transmute:
                return new TransmuteCard();
            case TravellingFair:
                return new TravellingFairCard();
            case TreasureHunter:
                return new TreasureHunterCard();
            case TreasureMap:
                return new TreasureMapCard();
            case TreasureTrove:
                return new TreasureTroveCard();
            case Treasury:
                return new TreasuryCard();
            case Tribute:
                return new TributeCard();
            case Triumph:
                return new TriumphCard();
            case TrustySteed:
                return new TrustySteedCard();
            case Tunnel:
                return new TunnelCard();
            case University:
                return new UniversityCard();
            case Upgrade:
                return new UpgradeCard();
            case Urchin:
                return new UrchinCard();
            case Vagrant:
                return new VagrantCard();
            case Vassal:
                return new VassalCard();
            case Vault:
                return new VaultCard();
            case Venture:
                return new VentureCard();
            case Villa:
                return new VillaCard();
            case Village:
                return new VillageCard();
            case Vineyard:
                return new VineyardCard();
            case WalledVillage:
                return new WalledVillageCard();
            case WanderingMinstrel:
                return new WanderingMinstrelCard();
            case Warehouse:
                return new WarehouseCard();
            case Warrior:
                return new WarriorCard();
            case Watchtower:
                return new WatchtowerCard();
            case Wedding:
                return new WeddingCard();
            case Wharf:
                return new WharfCard();
            case WildHunt:
                return new WildHuntCard();
            case Windfall:
                return new WindfallCard();
            case WineMerchant:
                return new WineMerchantCard();
            case WishingWell:
                return new WishingWellCard();
            case Witch:
                return new WitchCard();
            case Woodcutter:
                return new WoodcutterCard();
            case WorkersVillage:
                return new WorkersVillageCard();
            case Workshop:
                return new WorkshopCard();
            case YoungWitch:
                return new YoungWitchCard();
        }
        return new DomCard(this);
    }

    public String toHTML() {
        String theString = toString();
        if (DomEngine.showColoredLog) {
            if (hasCardType(DomCardType.Curse))
                return "<FONT style=\"BACKGROUND-COLOR: #CC8BC7\">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Treasure) && hasCardType(DomCardType.Victory))
                return "<FONT style=\"BACKGROUND-COLOR: #A9E96E\">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Action) && hasCardType(DomCardType.Victory))
                return "<FONT style=\"BACKGROUND-COLOR: #6EE9C2\">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Reaction) && hasCardType(DomCardType.Treasure))
                return "<FONT style=\"BACKGROUND-COLOR: #CCFF99\">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Reaction))
                return "<FONT style=\"BACKGROUND-COLOR: #91A4FC\">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Treasure))
                return "<FONT style=\"BACKGROUND-COLOR: #F3F584\">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Victory))
                return "<FONT style=\"BACKGROUND-COLOR: #8EBF75\">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Duration))
                return "<FONT style=\"BACKGROUND-COLOR: #F88017\">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Action))
                return "<FONT style=\"BACKGROUND-COLOR: #D9D9D9 \">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Event))
                return "<FONT style=\"BACKGROUND-COLOR: #B01E7D \">" + theString + "</FONT>";
            if (hasCardType(DomCardType.Landmark))
                return "<FONT style=\"BACKGROUND-COLOR: #339966 \">" + theString + "</FONT>";
        }
        return theString;
    }

    public String toString() {
        String theString = super.toString().replaceAll("_", " ").replaceAll("\\$", "'");
        if (this == DomCardName.IllGottenGains)
            return "Ill-Gotten Gains";
        return theString;
    }

    public DomSet getSet() {
        for (DomSet set : DomSet.values()) {
            if (set.contains(this))
                return set;
        }
        return null;
    }

    public URL getImageURL() {
//		return null;
        //TODO this should be called in some other way
        return new EscapeDialog().getClass().getResource(getImageLocation());
    }

    public String getImageLocation() {
        StringBuilder theLocation = new StringBuilder();
        theLocation.append("images/");
        theLocation.append(super.toString()).append(".jpg");
        return theLocation.toString().toLowerCase().replaceAll("_", "").replaceAll("\\$", "");
    }

    public String getCompleteImageLocation() {
//		return null;
        //TODO this should be called in some other way
//		return new EscapeDialog().getClass().getResource(getImageLocation());
        return "C:/Documents and Settings/djag492/My Documents/Jeroen/Dominion/" + getImageLocation();
//		return  "C:/Users/MEDION/Pictures/" + getImageLocation();
    }

    public int getOrderInBuyRules(DomPlayer owner) {
        int i = 0;
        if (owner == null)
            return 1000;
        for (DomBuyRule rule : owner.getBuyRules()) {
            if (rule.getCardToBuy() == this && owner.wantsToGainOrKeep(this)) {
                return i;
            }
            i++;
        }
        return 1000;
    }

    public int getDebtCost() {
        return getCost().getDebt();
    }

}
