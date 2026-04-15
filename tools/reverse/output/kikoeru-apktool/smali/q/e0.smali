.class public final Lq/e0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj1/q;Ly/f;Ly/h;Ly/o0;Lf1/f;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lq/e0;->b:I

    .line 1
    iput-object p1, p0, Lq/e0;->f:Ljava/lang/Object;

    iput-object p2, p0, Lq/e0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lq/e0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lq/e0;->g:Ljava/lang/Object;

    iput-object p5, p0, Lq/e0;->h:Ljava/lang/Object;

    iput p6, p0, Lq/e0;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lr/q1;Lj1/q;Lr/x;Lic/k;Lf1/f;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq/e0;->b:I

    .line 2
    iput-object p1, p0, Lq/e0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lq/e0;->f:Ljava/lang/Object;

    iput-object p3, p0, Lq/e0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lq/e0;->g:Ljava/lang/Object;

    iput-object p5, p0, Lq/e0;->h:Ljava/lang/Object;

    iput p6, p0, Lq/e0;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lr/q1;Lr/m1;Ljava/lang/Object;Ljava/lang/Object;Lr/x;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq/e0;->b:I

    .line 3
    iput-object p1, p0, Lq/e0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lq/e0;->f:Ljava/lang/Object;

    iput-object p3, p0, Lq/e0;->g:Ljava/lang/Object;

    iput-object p4, p0, Lq/e0;->h:Ljava/lang/Object;

    iput-object p5, p0, Lq/e0;->d:Ljava/lang/Object;

    iput p6, p0, Lq/e0;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lq/e0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Lx0/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lq/e0;->f:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Lj1/q;

    .line 18
    .line 19
    iget-object p1, p0, Lq/e0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    check-cast v2, Ly/f;

    .line 23
    .line 24
    iget-object p1, p0, Lq/e0;->d:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    check-cast v3, Ly/h;

    .line 28
    .line 29
    iget-object p1, p0, Lq/e0;->g:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    check-cast v4, Ly/o0;

    .line 33
    .line 34
    iget-object p1, p0, Lq/e0;->h:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, p1

    .line 37
    check-cast v5, Lf1/f;

    .line 38
    .line 39
    iget p1, p0, Lq/e0;->e:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-static/range {v1 .. v7}, Ly/d;->c(Lj1/q;Ly/f;Ly/h;Ly/o0;Lf1/f;Lx0/o;I)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_0
    move-object v5, p1

    .line 54
    check-cast v5, Lx0/o;

    .line 55
    .line 56
    check-cast p2, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lq/e0;->c:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v0, p1

    .line 64
    check-cast v0, Lr/q1;

    .line 65
    .line 66
    iget-object p1, p0, Lq/e0;->f:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v1, p1

    .line 69
    check-cast v1, Lr/m1;

    .line 70
    .line 71
    iget-object p1, p0, Lq/e0;->d:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v4, p1

    .line 74
    check-cast v4, Lr/x;

    .line 75
    .line 76
    iget p1, p0, Lq/e0;->e:I

    .line 77
    .line 78
    or-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    iget-object v2, p0, Lq/e0;->g:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v3, p0, Lq/e0;->h:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static/range {v0 .. v6}, Lr/t1;->a(Lr/q1;Lr/m1;Ljava/lang/Object;Ljava/lang/Object;Lr/x;Lx0/o;I)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 92
    .line 93
    return-object p1

    .line 94
    :pswitch_1
    move-object v5, p1

    .line 95
    check-cast v5, Lx0/o;

    .line 96
    .line 97
    check-cast p2, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lq/e0;->c:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v0, p1

    .line 105
    check-cast v0, Lr/q1;

    .line 106
    .line 107
    iget-object p1, p0, Lq/e0;->f:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v1, p1

    .line 110
    check-cast v1, Lj1/q;

    .line 111
    .line 112
    iget-object p1, p0, Lq/e0;->d:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v2, p1

    .line 115
    check-cast v2, Lr/x;

    .line 116
    .line 117
    iget-object p1, p0, Lq/e0;->g:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v3, p1

    .line 120
    check-cast v3, Lic/k;

    .line 121
    .line 122
    iget-object p1, p0, Lq/e0;->h:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v4, p1

    .line 125
    check-cast v4, Lf1/f;

    .line 126
    .line 127
    iget p1, p0, Lq/e0;->e:I

    .line 128
    .line 129
    or-int/lit8 p1, p1, 0x1

    .line 130
    .line 131
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-static/range {v0 .. v6}, Ln7/b0;->d(Lr/q1;Lj1/q;Lr/x;Lic/k;Lf1/f;Lx0/o;I)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 139
    .line 140
    return-object p1

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
