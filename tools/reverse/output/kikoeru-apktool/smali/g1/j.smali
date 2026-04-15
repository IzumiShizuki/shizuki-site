.class public final Lg1/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lg1/g;
.implements Lw7/e;


# instance fields
.field public final synthetic a:Lg1/h;

.field public final b:Lv2/e;

.field public final c:Landroidx/lifecycle/z;

.field public final d:Lv2/e;


# direct methods
.method public constructor <init>(Lg1/h;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg1/j;->a:Lg1/h;

    .line 5
    .line 6
    new-instance v0, Lm4/z;

    .line 7
    .line 8
    new-instance v1, Lt9/f;

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    invoke-direct {v1, v2, p0}, Lt9/f;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lm4/z;-><init>(Lw7/e;Lt9/f;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lv2/e;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lv2/e;-><init>(Lm4/z;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lg1/j;->b:Lv2/e;

    .line 23
    .line 24
    new-instance v0, Landroidx/lifecycle/z;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v0, p0, v2}, Landroidx/lifecycle/z;-><init>(Landroidx/lifecycle/x;Z)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lg1/j;->c:Landroidx/lifecycle/z;

    .line 31
    .line 32
    iget-object v0, v1, Lv2/e;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lv2/e;

    .line 35
    .line 36
    iput-object v0, p0, Lg1/j;->d:Lv2/e;

    .line 37
    .line 38
    const-string v0, "androidx.savedstate.SavedStateRegistry"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lg1/h;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    instance-of v3, v2, Landroid/os/Bundle;

    .line 45
    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    check-cast v2, Landroid/os/Bundle;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v2, 0x0

    .line 52
    :goto_0
    invoke-virtual {v1, v2}, Lv2/e;->t(Landroid/os/Bundle;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Landroidx/lifecycle/n0;

    .line 56
    .line 57
    const/16 v2, 0xb

    .line 58
    .line 59
    invoke-direct {v1, v2, p0}, Landroidx/lifecycle/n0;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0, v1}, Lg1/h;->g(Ljava/lang/String;Lic/a;)Lg1/f;

    .line 63
    .line 64
    .line 65
    return-void
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


# virtual methods
.method public final b(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/j;->a:Lg1/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg1/h;->b(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/j;->a:Lg1/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg1/h;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/j;->a:Lg1/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg1/h;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public final e()Lv2/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/j;->d:Lv2/e;

    .line 2
    .line 3
    return-object v0
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

.method public final f()Landroidx/lifecycle/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/j;->c:Landroidx/lifecycle/z;

    .line 2
    .line 3
    return-object v0
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

.method public final g(Ljava/lang/String;Lic/a;)Lg1/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/j;->a:Lg1/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lg1/h;->g(Ljava/lang/String;Lic/a;)Lg1/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method
