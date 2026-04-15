.class public final synthetic Lfa/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic a:Lhf/y;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lhf/y;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfa/i;->a:Lhf/y;

    .line 5
    .line 6
    iput-wide p2, p0, Lfa/i;->b:J

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
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ly/k1;

    .line 2
    .line 3
    move-object v4, p2

    .line 4
    check-cast v4, Lx0/o;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const-string p3, "$this$TopAppBar"

    .line 13
    .line 14
    invoke-static {p1, p3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    and-int/lit8 p1, p2, 0x11

    .line 18
    .line 19
    const/16 p3, 0x10

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq p1, p3, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    and-int/2addr p2, v0

    .line 28
    invoke-virtual {v4, p2, p1}, Lx0/o;->N(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lfa/i;->a:Lhf/y;

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iget-wide v0, p0, Lfa/i;->b:J

    .line 41
    .line 42
    invoke-virtual {v4, v0, v1}, Lx0/o;->e(J)Z

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    or-int/2addr p2, p3

    .line 47
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    if-nez p2, :cond_1

    .line 52
    .line 53
    sget-object p2, Lx0/k;->a:Lx0/r0;

    .line 54
    .line 55
    if-ne p3, p2, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance p3, Lda/r;

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    invoke-direct {p3, p1, v0, v1, p2}, Lda/r;-><init>(Ljava/lang/Object;JI)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, p3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    move-object v0, p3

    .line 67
    check-cast v0, Lic/a;

    .line 68
    .line 69
    const/16 v5, 0x6000

    .line 70
    .line 71
    const/16 v6, 0xe

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    const/4 v2, 0x0

    .line 75
    sget-object v3, Lfa/b;->m:Lf1/f;

    .line 76
    .line 77
    invoke-static/range {v0 .. v6}, Lm0/p3;->a(Lic/a;Lj1/q;ZLic/n;Lx0/o;II)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {v4}, Lx0/o;->Q()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 85
    .line 86
    return-object p1
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
