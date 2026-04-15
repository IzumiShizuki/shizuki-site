.class public final Ld7/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/AspectRatioFrameLayout;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld7/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/beta/upgrade/d;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld7/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/b;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Ld7/b;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Ld7/b;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ld7/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lcom/tencent/bugly/beta/upgrade/d;

    .line 9
    .line 10
    iget-boolean v0, p0, Ld7/b;->b:Z

    .line 11
    .line 12
    invoke-static {v1, v0}, Lcom/tencent/bugly/beta/upgrade/d;->a(Lcom/tencent/bugly/beta/upgrade/d;Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Ld7/b;->b:Z

    .line 18
    .line 19
    check-cast v1, Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 20
    .line 21
    sget v0, Landroidx/media3/ui/AspectRatioFrameLayout;->d:I

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
.end method
