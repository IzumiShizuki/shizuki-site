.class public final enum Lx0/g1;
.super Ljava/lang/Enum;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final enum a:Lx0/g1;

.field public static final enum b:Lx0/g1;

.field public static final enum c:Lx0/g1;

.field public static final synthetic d:[Lx0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lx0/g1;

    .line 2
    .line 3
    const-string v1, "Invalid"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lx0/g1;

    .line 10
    .line 11
    const-string v3, "Cancelled"

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lx0/g1;->a:Lx0/g1;

    .line 18
    .line 19
    new-instance v3, Lx0/g1;

    .line 20
    .line 21
    const-string v5, "InitialPending"

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    new-instance v5, Lx0/g1;

    .line 28
    .line 29
    const-string v7, "RecomposePending"

    .line 30
    .line 31
    const/4 v8, 0x3

    .line 32
    invoke-direct {v5, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    new-instance v7, Lx0/g1;

    .line 36
    .line 37
    const-string v9, "Recomposing"

    .line 38
    .line 39
    const/4 v10, 0x4

    .line 40
    invoke-direct {v7, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    sput-object v7, Lx0/g1;->b:Lx0/g1;

    .line 44
    .line 45
    new-instance v9, Lx0/g1;

    .line 46
    .line 47
    const-string v11, "ApplyPending"

    .line 48
    .line 49
    const/4 v12, 0x5

    .line 50
    invoke-direct {v9, v11, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    sput-object v9, Lx0/g1;->c:Lx0/g1;

    .line 54
    .line 55
    new-instance v11, Lx0/g1;

    .line 56
    .line 57
    const-string v13, "Applied"

    .line 58
    .line 59
    const/4 v14, 0x6

    .line 60
    invoke-direct {v11, v13, v14}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    const/4 v13, 0x7

    .line 64
    new-array v13, v13, [Lx0/g1;

    .line 65
    .line 66
    aput-object v0, v13, v2

    .line 67
    .line 68
    aput-object v1, v13, v4

    .line 69
    .line 70
    aput-object v3, v13, v6

    .line 71
    .line 72
    aput-object v5, v13, v8

    .line 73
    .line 74
    aput-object v7, v13, v10

    .line 75
    .line 76
    aput-object v9, v13, v12

    .line 77
    .line 78
    aput-object v11, v13, v14

    .line 79
    .line 80
    sput-object v13, Lx0/g1;->d:[Lx0/g1;

    .line 81
    .line 82
    return-void
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public static valueOf(Ljava/lang/String;)Lx0/g1;
    .locals 1

    .line 1
    const-class v0, Lx0/g1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lx0/g1;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static values()[Lx0/g1;
    .locals 1

    .line 1
    sget-object v0, Lx0/g1;->d:[Lx0/g1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lx0/g1;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
