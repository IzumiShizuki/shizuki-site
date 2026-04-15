.class public final Lwa/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lr/y1;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/Window;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lwa/a;->a:Landroid/view/View;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    new-instance v0, Lr/y1;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lr/y1;-><init>(Landroid/view/View;Landroid/view/Window;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-object v0, p0, Lwa/a;->b:Lr/y1;

    .line 21
    .line 22
    return-void
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
.method public final a(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lwa/a;->b:Lr/y1;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v2, v1, Lr/y1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lu3/x0;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lu3/x0;->G(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-object v2, v1, Lr/y1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lu3/x0;

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Lu3/x0;->u(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x2

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    iget-object p1, v1, Lr/y1;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lu3/x0;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lu3/x0;->G(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    if-eqz v1, :cond_3

    .line 39
    .line 40
    iget-object p1, v1, Lr/y1;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lu3/x0;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lu3/x0;->u(I)V

    .line 45
    .line 46
    .line 47
    :cond_3
    return-void
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
.end method
