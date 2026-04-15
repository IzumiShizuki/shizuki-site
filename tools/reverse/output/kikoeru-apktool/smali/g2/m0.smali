.class public final Lg2/m0;
.super Li2/g0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic b:Lg2/p0;

.field public final synthetic c:Lic/n;


# direct methods
.method public constructor <init>(Lg2/p0;Lic/n;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg2/m0;->b:Lg2/p0;

    .line 2
    .line 3
    iput-object p2, p0, Lg2/m0;->c:Lic/n;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Li2/g0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final h(Lg2/x0;Ljava/util/List;J)Lg2/w0;
    .locals 6

    .line 1
    iget-object v2, p0, Lg2/m0;->b:Lg2/p0;

    .line 2
    .line 3
    iget-object p2, v2, Lg2/p0;->h:Lg2/k0;

    .line 4
    .line 5
    invoke-interface {p1}, Lg2/y;->getLayoutDirection()Lf3/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p2, Lg2/k0;->a:Lf3/m;

    .line 10
    .line 11
    invoke-interface {p1}, Lf3/c;->a()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p2, Lg2/k0;->b:F

    .line 16
    .line 17
    invoke-interface {p1}, Lf3/c;->M()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p2, Lg2/k0;->c:F

    .line 22
    .line 23
    invoke-interface {p1}, Lg2/y;->O()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v0, p0, Lg2/m0;->c:Lic/n;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    iget-object p1, v2, Lg2/p0;->a:Li2/j0;

    .line 33
    .line 34
    iget-object p1, p1, Li2/j0;->h:Li2/j0;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iput v1, v2, Lg2/p0;->e:I

    .line 39
    .line 40
    iget-object p1, v2, Lg2/p0;->i:Lg2/h0;

    .line 41
    .line 42
    new-instance p2, Lf3/a;

    .line 43
    .line 44
    invoke-direct {p2, p3, p4}, Lf3/a;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p1, p2}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    move-object v1, p1

    .line 52
    check-cast v1, Lg2/w0;

    .line 53
    .line 54
    iget v3, v2, Lg2/p0;->e:I

    .line 55
    .line 56
    new-instance v0, Lg2/l0;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v4, v1

    .line 60
    invoke-direct/range {v0 .. v5}, Lg2/l0;-><init>(Lg2/w0;Lg2/p0;ILg2/w0;I)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_0
    iput v1, v2, Lg2/p0;->d:I

    .line 65
    .line 66
    new-instance p1, Lf3/a;

    .line 67
    .line 68
    invoke-direct {p1, p3, p4}, Lf3/a;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, p2, p1}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    move-object v1, p1

    .line 76
    check-cast v1, Lg2/w0;

    .line 77
    .line 78
    iget v3, v2, Lg2/p0;->d:I

    .line 79
    .line 80
    new-instance v0, Lg2/l0;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    move-object v4, v1

    .line 84
    invoke-direct/range {v0 .. v5}, Lg2/l0;-><init>(Lg2/w0;Lg2/p0;ILg2/w0;I)V

    .line 85
    .line 86
    .line 87
    return-object v0
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
