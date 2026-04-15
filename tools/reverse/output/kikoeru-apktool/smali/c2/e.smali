.class public final Lc2/e;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljc/u;


# direct methods
.method public constructor <init>(Li7/p2;Lm1/d;Ljc/u;)V
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, Lc2/e;->b:I

    .line 1
    iput-object p3, p0, Lc2/e;->c:Ljc/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljc/u;I)V
    .locals 0

    .line 2
    iput p2, p0, Lc2/e;->b:I

    iput-object p1, p0, Lc2/e;->c:Ljc/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc2/e;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lm1/d;

    .line 7
    .line 8
    iget-boolean v0, p1, Lj1/p;->n:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p1, Li2/c2;->b:Li2/c2;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object v0, p1, Lm1/d;->p:Lm1/d;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    .line 21
    .line 22
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p1, Lm1/d;->p:Lm1/d;

    .line 27
    .line 28
    iget-object p1, p0, Lc2/e;->c:Ljc/u;

    .line 29
    .line 30
    iget-boolean v0, p1, Ljc/u;->a:Z

    .line 31
    .line 32
    iput-boolean v0, p1, Ljc/u;->a:Z

    .line 33
    .line 34
    sget-object p1, Li2/c2;->a:Li2/c2;

    .line 35
    .line 36
    :goto_1
    return-object p1

    .line 37
    :pswitch_0
    check-cast p1, Ll0/p;

    .line 38
    .line 39
    iget-object p1, p1, Ll0/p;->f:Lt2/i0;

    .line 40
    .line 41
    iget-object p1, p1, Lt2/i0;->a:Lt2/h0;

    .line 42
    .line 43
    iget-object p1, p1, Lt2/h0;->a:Lt2/g;

    .line 44
    .line 45
    iget-object p1, p1, Lt2/g;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-lez p1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lc2/e;->c:Ljc/u;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p1, Ljc/u;->a:Z

    .line 57
    .line 58
    :cond_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_1
    check-cast p1, Lc2/g;

    .line 62
    .line 63
    iget-boolean p1, p1, Lc2/g;->q:Z

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    iget-object p1, p0, Lc2/e;->c:Ljc/u;

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p1, Ljc/u;->a:Z

    .line 71
    .line 72
    sget-object p1, Li2/c2;->c:Li2/c2;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    sget-object p1, Li2/c2;->a:Li2/c2;

    .line 76
    .line 77
    :goto_2
    return-object p1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
