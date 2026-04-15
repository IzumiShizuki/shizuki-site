.class public final Li7/j1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    mul-int/lit8 v0, p1, 0x3

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Li7/j1;->a:I

    .line 6
    iput p1, p0, Li7/j1;->b:I

    .line 7
    iput v0, p0, Li7/j1;->c:I

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p1, p0, Li7/j1;->a:I

    iput p2, p0, Li7/j1;->b:I

    iput p3, p0, Li7/j1;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ly0/i0;I)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget v0, p1, Ly0/i0;->b:I

    iget p1, p1, Ly0/i0;->c:I

    invoke-direct {p0, v0, p1, p2}, Li7/j1;-><init>(III)V

    return-void
.end method

.method public constructor <init>(Lyd/b;)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, p1, v0}, Li7/j1;-><init>(Ly0/i0;I)V

    return-void
.end method
