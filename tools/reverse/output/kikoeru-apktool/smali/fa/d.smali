.class public final synthetic Lfa/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lx0/n2;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILhf/y;Lx0/w0;Lx0/w0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lfa/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lfa/d;->c:Lx0/n2;

    iput-object p2, p0, Lfa/d;->e:Ljava/lang/Object;

    iput p1, p0, Lfa/d;->b:I

    iput-object p4, p0, Lfa/d;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lx0/c0;Lf1/h;Lo/f0;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lfa/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa/d;->c:Lx0/n2;

    iput-object p2, p0, Lfa/d;->d:Ljava/lang/Object;

    iput-object p3, p0, Lfa/d;->e:Ljava/lang/Object;

    iput p4, p0, Lfa/d;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lfa/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfa/d;->c:Lx0/n2;

    .line 7
    .line 8
    check-cast v0, Lx0/c0;

    .line 9
    .line 10
    iget-object v1, p0, Lfa/d;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lf1/h;

    .line 13
    .line 14
    iget-object v2, p0, Lfa/d;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lo/f0;

    .line 17
    .line 18
    if-eq p1, v0, :cond_2

    .line 19
    .line 20
    instance-of v0, p1, Lh1/e0;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget v0, v1, Lf1/h;->a:I

    .line 25
    .line 26
    iget v1, p0, Lfa/d;->b:I

    .line 27
    .line 28
    sub-int/2addr v0, v1

    .line 29
    invoke-virtual {v2, p1}, Lo/f0;->d(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ltz v1, :cond_0

    .line 34
    .line 35
    iget-object v3, v2, Lo/f0;->c:[I

    .line 36
    .line 37
    aget v1, v3, v1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const v1, 0x7fffffff

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {v2, v0, p1}, Lo/f0;->h(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "A derived state calculation cannot read itself"

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :pswitch_0
    iget-object v0, p0, Lfa/d;->c:Lx0/n2;

    .line 62
    .line 63
    check-cast v0, Lx0/w0;

    .line 64
    .line 65
    iget-object v1, p0, Lfa/d;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Lhf/y;

    .line 68
    .line 69
    iget-object v2, p0, Lfa/d;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lx0/w0;

    .line 72
    .line 73
    check-cast p1, Lx0/f0;

    .line 74
    .line 75
    const-string v3, "$this$DisposableEffect"

    .line 76
    .line 77
    invoke-static {p1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-interface {v0, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, Lfa/h;

    .line 86
    .line 87
    iget v3, p0, Lfa/d;->b:I

    .line 88
    .line 89
    invoke-direct {p1, v3, v1, v2, v0}, Lfa/h;-><init>(ILhf/y;Lx0/w0;Lx0/w0;)V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
