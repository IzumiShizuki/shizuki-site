.class public final enum Lwd/c0;
.super Ljava/lang/Enum;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lce/q;


# static fields
.field public static final synthetic b:[Lwd/c0;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lwd/c0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "DECLARATION"

    .line 5
    .line 6
    invoke-direct {v0, v1, v1, v2}, Lwd/c0;-><init>(IILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lwd/c0;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const-string v4, "FAKE_OVERRIDE"

    .line 13
    .line 14
    invoke-direct {v2, v3, v3, v4}, Lwd/c0;-><init>(IILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v4, Lwd/c0;

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    const-string v6, "DELEGATION"

    .line 21
    .line 22
    invoke-direct {v4, v5, v5, v6}, Lwd/c0;-><init>(IILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v6, Lwd/c0;

    .line 26
    .line 27
    const/4 v7, 0x3

    .line 28
    const-string v8, "SYNTHESIZED"

    .line 29
    .line 30
    invoke-direct {v6, v7, v7, v8}, Lwd/c0;-><init>(IILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v8, 0x4

    .line 34
    new-array v8, v8, [Lwd/c0;

    .line 35
    .line 36
    aput-object v0, v8, v1

    .line 37
    .line 38
    aput-object v2, v8, v3

    .line 39
    .line 40
    aput-object v4, v8, v5

    .line 41
    .line 42
    aput-object v6, v8, v7

    .line 43
    .line 44
    sput-object v8, Lwd/c0;->b:[Lwd/c0;

    .line 45
    .line 46
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lwd/c0;->a:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static valueOf(Ljava/lang/String;)Lwd/c0;
    .locals 1

    .line 1
    const-class v0, Lwd/c0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwd/c0;

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

.method public static values()[Lwd/c0;
    .locals 1

    .line 1
    sget-object v0, Lwd/c0;->b:[Lwd/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lwd/c0;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwd/c0;

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


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lwd/c0;->a:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
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
