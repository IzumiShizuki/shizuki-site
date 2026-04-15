.class public final Lsc/w0;
.super Lsc/f0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic g:[Lpc/u;


# instance fields
.field public final c:Lsc/z1;

.field public final d:Lsc/z1;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljc/s;

    .line 2
    .line 3
    const-class v1, Lsc/w0;

    .line 4
    .line 5
    const-string v2, "kotlinClass"

    .line 6
    .line 7
    const-string v3, "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/s;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljc/a0;->g(Ljc/s;)Lpc/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v3, "scope"

    .line 20
    .line 21
    const-string v5, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    .line 22
    .line 23
    invoke-static {v1, v3, v5, v4, v2}, Lq/t0;->H(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/t;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v5, "members"

    .line 28
    .line 29
    const-string v6, "getMembers()Ljava/util/Collection;"

    .line 30
    .line 31
    invoke-static {v1, v5, v6, v4, v2}, Lq/t0;->H(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/t;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x3

    .line 36
    new-array v2, v2, [Lpc/u;

    .line 37
    .line 38
    aput-object v0, v2, v4

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    aput-object v3, v2, v0

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    aput-object v1, v2, v0

    .line 45
    .line 46
    sput-object v2, Lsc/w0;->g:[Lpc/u;

    .line 47
    .line 48
    return-void
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

.method public constructor <init>(Lsc/x0;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lsc/f0;-><init>(Lsc/i0;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsc/t0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p1, v1}, Lsc/t0;-><init>(Lsc/x0;I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lsc/w0;->c:Lsc/z1;

    .line 16
    .line 17
    new-instance v0, Lsc/u0;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, p0, v2}, Lsc/u0;-><init>(Lsc/w0;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lsc/w0;->d:Lsc/z1;

    .line 28
    .line 29
    new-instance v0, Lsc/v0;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1}, Lsc/v0;-><init>(Lsc/w0;Lsc/x0;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Lub/i;->a:Lub/i;

    .line 35
    .line 36
    invoke-static {v2, v0}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lsc/w0;->e:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance v0, Lsc/u0;

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-direct {v0, p0, v3}, Lsc/u0;-><init>(Lsc/w0;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2, v0}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lsc/w0;->f:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v0, Lsc/v0;

    .line 55
    .line 56
    invoke-direct {v0, p1, p0}, Lsc/v0;-><init>(Lsc/x0;Lsc/w0;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 60
    .line 61
    .line 62
    return-void
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
.end method
