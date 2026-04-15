.class public final La0/b;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj1/q;

.field public final synthetic d:La0/g0;

.field public final synthetic e:Ly/d1;

.field public final synthetic f:Lu/p0;

.field public final synthetic g:Z

.field public final synthetic h:Ls/f;

.field public final synthetic i:Lj1/f;

.field public final synthetic j:Ly/h;

.field public final synthetic k:Lic/k;

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public constructor <init>(Lj1/q;La0/g0;Ly/d1;Lu/p0;ZLs/f;Lj1/f;Ly/h;Lic/k;II)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La0/b;->b:I

    .line 1
    iput-object p1, p0, La0/b;->c:Lj1/q;

    iput-object p2, p0, La0/b;->d:La0/g0;

    iput-object p3, p0, La0/b;->e:Ly/d1;

    iput-object p4, p0, La0/b;->f:Lu/p0;

    iput-boolean p5, p0, La0/b;->g:Z

    iput-object p6, p0, La0/b;->h:Ls/f;

    iput-object p7, p0, La0/b;->i:Lj1/f;

    iput-object p8, p0, La0/b;->j:Ly/h;

    iput-object p9, p0, La0/b;->k:Lic/k;

    iput p10, p0, La0/b;->l:I

    iput p11, p0, La0/b;->m:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lj1/q;La0/g0;Ly/d1;Ly/h;Lj1/f;Lu/p0;ZLs/f;Lic/k;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La0/b;->b:I

    .line 2
    iput-object p1, p0, La0/b;->c:Lj1/q;

    iput-object p2, p0, La0/b;->d:La0/g0;

    iput-object p3, p0, La0/b;->e:Ly/d1;

    iput-object p4, p0, La0/b;->j:Ly/h;

    iput-object p5, p0, La0/b;->i:Lj1/f;

    iput-object p6, p0, La0/b;->f:Lu/p0;

    iput-boolean p7, p0, La0/b;->g:Z

    iput-object p8, p0, La0/b;->h:Ls/f;

    iput-object p9, p0, La0/b;->k:Lic/k;

    iput p10, p0, La0/b;->l:I

    iput p11, p0, La0/b;->m:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, La0/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v9, p1

    .line 7
    check-cast v9, Lx0/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget p1, p0, La0/b;->l:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget p1, p0, La0/b;->m:I

    .line 23
    .line 24
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p0, La0/b;->d:La0/g0;

    .line 29
    .line 30
    iget-object v4, p0, La0/b;->k:Lic/k;

    .line 31
    .line 32
    iget-object v5, p0, La0/b;->i:Lj1/f;

    .line 33
    .line 34
    iget-object v6, p0, La0/b;->c:Lj1/q;

    .line 35
    .line 36
    iget-object v7, p0, La0/b;->h:Ls/f;

    .line 37
    .line 38
    iget-object v8, p0, La0/b;->f:Lu/p0;

    .line 39
    .line 40
    iget-object v10, p0, La0/b;->j:Ly/h;

    .line 41
    .line 42
    iget-object v11, p0, La0/b;->e:Ly/d1;

    .line 43
    .line 44
    iget-boolean v12, p0, La0/b;->g:Z

    .line 45
    .line 46
    invoke-static/range {v1 .. v12}, La2/c;->h(IILa0/g0;Lic/k;Lj1/f;Lj1/q;Ls/f;Lu/p0;Lx0/o;Ly/h;Ly/d1;Z)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_0
    move-object v8, p1

    .line 53
    check-cast v8, Lx0/o;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    iget p1, p0, La0/b;->l:I

    .line 61
    .line 62
    or-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget v1, p0, La0/b;->m:I

    .line 69
    .line 70
    iget-object v2, p0, La0/b;->d:La0/g0;

    .line 71
    .line 72
    iget-object v3, p0, La0/b;->k:Lic/k;

    .line 73
    .line 74
    iget-object v4, p0, La0/b;->i:Lj1/f;

    .line 75
    .line 76
    iget-object v5, p0, La0/b;->c:Lj1/q;

    .line 77
    .line 78
    iget-object v6, p0, La0/b;->h:Ls/f;

    .line 79
    .line 80
    iget-object v7, p0, La0/b;->f:Lu/p0;

    .line 81
    .line 82
    iget-object v9, p0, La0/b;->j:Ly/h;

    .line 83
    .line 84
    iget-object v10, p0, La0/b;->e:Ly/d1;

    .line 85
    .line 86
    iget-boolean v11, p0, La0/b;->g:Z

    .line 87
    .line 88
    invoke-static/range {v0 .. v11}, La/a;->g(IILa0/g0;Lic/k;Lj1/f;Lj1/q;Ls/f;Lu/p0;Lx0/o;Ly/h;Ly/d1;Z)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 92
    .line 93
    return-object p1

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
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
