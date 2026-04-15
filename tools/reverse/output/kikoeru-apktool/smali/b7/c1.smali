.class public final Lb7/c1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lc7/l0;

.field public final b:Lc7/p1;

.field public final c:Lc7/r0;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/CharSequence;

.field public final f:I

.field public final g:I

.field public final h:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lb7/c1;->a:Lc7/l0;

    .line 3
    iput-object v0, p0, Lb7/c1;->b:Lc7/p1;

    .line 4
    iput-object v0, p0, Lb7/c1;->c:Lc7/r0;

    .line 5
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lb7/c1;->d:Ljava/util/List;

    .line 6
    iput-object v0, p0, Lb7/c1;->e:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lb7/c1;->f:I

    .line 8
    iput v0, p0, Lb7/c1;->g:I

    .line 9
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, Lb7/c1;->h:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Lb7/c1;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iget-object v0, p1, Lb7/c1;->a:Lc7/l0;

    iput-object v0, p0, Lb7/c1;->a:Lc7/l0;

    .line 22
    iget-object v0, p1, Lb7/c1;->b:Lc7/p1;

    iput-object v0, p0, Lb7/c1;->b:Lc7/p1;

    .line 23
    iget-object v0, p1, Lb7/c1;->c:Lc7/r0;

    iput-object v0, p0, Lb7/c1;->c:Lc7/r0;

    .line 24
    iget-object v0, p1, Lb7/c1;->d:Ljava/util/List;

    iput-object v0, p0, Lb7/c1;->d:Ljava/util/List;

    .line 25
    iget-object v0, p1, Lb7/c1;->e:Ljava/lang/CharSequence;

    iput-object v0, p0, Lb7/c1;->e:Ljava/lang/CharSequence;

    .line 26
    iget v0, p1, Lb7/c1;->f:I

    iput v0, p0, Lb7/c1;->f:I

    .line 27
    iget v0, p1, Lb7/c1;->g:I

    iput v0, p0, Lb7/c1;->g:I

    .line 28
    iget-object p1, p1, Lb7/c1;->h:Landroid/os/Bundle;

    iput-object p1, p0, Lb7/c1;->h:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Lc7/l0;Lc7/p1;Lc7/r0;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lb7/c1;->a:Lc7/l0;

    .line 12
    iput-object p2, p0, Lb7/c1;->b:Lc7/p1;

    .line 13
    iput-object p3, p0, Lb7/c1;->c:Lc7/r0;

    .line 14
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    check-cast p4, Ljava/util/List;

    iput-object p4, p0, Lb7/c1;->d:Ljava/util/List;

    .line 16
    iput-object p5, p0, Lb7/c1;->e:Ljava/lang/CharSequence;

    .line 17
    iput p6, p0, Lb7/c1;->f:I

    .line 18
    iput p7, p0, Lb7/c1;->g:I

    if-eqz p8, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    sget-object p8, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :goto_0
    iput-object p8, p0, Lb7/c1;->h:Landroid/os/Bundle;

    return-void
.end method
