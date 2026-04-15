.class public final Lm0/t2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lm0/x;

.field public b:Lf3/c;


# direct methods
.method public constructor <init>(Lm0/u2;Lic/k;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v4, Lm0/s2;->d:Lr/u1;

    .line 5
    .line 6
    new-instance v0, Lm0/x;

    .line 7
    .line 8
    new-instance v2, Lm0/n2;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v2, p0, v1}, Lm0/n2;-><init>(Lm0/t2;I)V

    .line 12
    .line 13
    .line 14
    new-instance v3, Landroidx/lifecycle/n0;

    .line 15
    .line 16
    const/16 v1, 0x11

    .line 17
    .line 18
    invoke-direct {v3, v1, p0}, Landroidx/lifecycle/n0;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object v1, p1

    .line 22
    move-object v5, p2

    .line 23
    invoke-direct/range {v0 .. v5}, Lm0/x;-><init>(Ljava/lang/Object;Lic/k;Lic/a;Lr/j;Lic/k;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lm0/t2;->a:Lm0/x;

    .line 27
    .line 28
    return-void
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
.end method


# virtual methods
.method public final a(Lac/i;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/t2;->a:Lm0/x;

    .line 2
    .line 3
    iget-object v1, v0, Lm0/x;->k:Lx0/a1;

    .line 4
    .line 5
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sget-object v2, Lm0/u2;->a:Lm0/u2;

    .line 10
    .line 11
    invoke-static {v0, v2, v1, p1}, La/a;->r(Lm0/x;Ljava/lang/Object;FLac/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 16
    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 21
    .line 22
    return-object p1
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

.method public final b()Lf3/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/t2;->b:Lf3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "The density on DrawerState ("

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ") was not set. Did you use DrawerState with the Drawer composable?"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1
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
.end method
