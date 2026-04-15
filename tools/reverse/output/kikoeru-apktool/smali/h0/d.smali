.class public final Lh0/d;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# static fields
.field public static final b:Lh0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh0/d;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljc/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lh0/d;->b:Lh0/d;

    .line 8
    .line 9
    return-void
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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lj1/q;

    .line 2
    .line 3
    check-cast p2, Lx0/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const p3, -0x7ec5e7f9

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p3}, Lx0/o;->W(I)V

    .line 14
    .line 15
    .line 16
    sget-object p3, Ll0/r1;->a:Lx0/z;

    .line 17
    .line 18
    invoke-virtual {p2, p3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    check-cast p3, Ll0/q1;

    .line 23
    .line 24
    iget-wide v0, p3, Ll0/q1;->a:J

    .line 25
    .line 26
    invoke-virtual {p2, v0, v1}, Lx0/o;->e(J)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    invoke-virtual {p2}, Lx0/o;->K()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-nez p3, :cond_0

    .line 35
    .line 36
    sget-object p3, Lx0/k;->a:Lx0/r0;

    .line 37
    .line 38
    if-ne v2, p3, :cond_1

    .line 39
    .line 40
    :cond_0
    new-instance v2, Lh0/c;

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {v2, v0, v1, p3}, Lh0/c;-><init>(JI)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    check-cast v2, Lic/k;

    .line 50
    .line 51
    sget-object p3, Lj1/n;->a:Lj1/n;

    .line 52
    .line 53
    invoke-static {p3, v2}, Landroidx/compose/ui/draw/a;->b(Lj1/q;Lic/k;)Lj1/q;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-interface {p1, p3}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/4 p3, 0x0

    .line 62
    invoke-virtual {p2, p3}, Lx0/o;->p(Z)V

    .line 63
    .line 64
    .line 65
    return-object p1
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
