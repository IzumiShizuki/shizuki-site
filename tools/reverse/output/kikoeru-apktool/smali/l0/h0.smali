.class public final Ll0/h0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lic/k;


# direct methods
.method public synthetic constructor <init>(Lic/k;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll0/h0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ll0/h0;->b:Lic/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final invoke(Lc2/x;Lyb/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ll0/h0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ll0/g0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    iget-object v3, p0, Ll0/h0;->b:Lic/k;

    .line 11
    .line 12
    invoke-direct {v0, v2, v3, v1}, Ll0/g0;-><init>(ILic/k;Lyb/c;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, p2}, Lu/w1;->e(Lc2/x;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 20
    .line 21
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p1, p2

    .line 27
    :goto_0
    if-ne p1, v0, :cond_1

    .line 28
    .line 29
    move-object p2, p1

    .line 30
    :cond_1
    return-object p2

    .line 31
    :pswitch_0
    new-instance v0, Ll0/g0;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    iget-object v3, p0, Ll0/h0;->b:Lic/k;

    .line 36
    .line 37
    invoke-direct {v0, v2, v3, v1}, Ll0/g0;-><init>(ILic/k;Lyb/c;)V

    .line 38
    .line 39
    .line 40
    check-cast p1, Lc2/j0;

    .line 41
    .line 42
    invoke-virtual {p1, v0, p2}, Lc2/j0;->B0(Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 47
    .line 48
    if-ne p1, p2, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 52
    .line 53
    :goto_1
    return-object p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 56
    .line 57
    .line 58
.end method
