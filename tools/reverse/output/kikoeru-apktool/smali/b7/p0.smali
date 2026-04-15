.class public final synthetic Lb7/p0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lb7/p0;->a:I

    iput-object p3, p0, Lb7/p0;->c:Ljava/lang/Object;

    iput p1, p0, Lb7/p0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv4/c0;IZ)V
    .locals 0

    .line 2
    const/4 p3, 0x2

    iput p3, p0, Lb7/p0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/p0;->c:Ljava/lang/Object;

    iput p2, p0, Lb7/p0;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lb7/p0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/p0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv4/c0;

    .line 9
    .line 10
    iget-object v1, v0, Lv4/c0;->v:Lw4/d;

    .line 11
    .line 12
    iget-object v0, v0, Lv4/c0;->a:[Lv4/a1;

    .line 13
    .line 14
    iget v2, p0, Lb7/p0;->b:I

    .line 15
    .line 16
    aget-object v0, v0, v2

    .line 17
    .line 18
    iget-object v0, v0, Lv4/a1;->a:Lv4/e;

    .line 19
    .line 20
    iget v0, v0, Lv4/e;->b:I

    .line 21
    .line 22
    invoke-virtual {v1}, Lw4/d;->Z()Lw4/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, Lw4/b;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {v2, v3}, Lw4/b;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0x409

    .line 33
    .line 34
    invoke-virtual {v1, v0, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, Lb7/p0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/function/IntConsumer;

    .line 41
    .line 42
    iget v1, p0, Lb7/p0;->b:I

    .line 43
    .line 44
    invoke-static {v0, v1}, La3/a;->A(Ljava/util/function/IntConsumer;I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    iget-object v0, p0, Lb7/p0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lb7/t0;

    .line 51
    .line 52
    iget-object v0, v0, Lb7/t0;->j:Lo/f;

    .line 53
    .line 54
    iget v1, p0, Lb7/p0;->b:I

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Lo/f;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
